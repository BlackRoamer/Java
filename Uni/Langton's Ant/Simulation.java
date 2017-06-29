package edu.kit.informatik;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

public void run(Board board) {
boolean isRunning = true;
while (isRunning) {
String inputCommand = Terminal.readLine();
if (inputCommand == null) {
return;
}
if (inputCommand.equals("quit")) {
isRunning = false;
}
String[] parts = inputCommand.split(" ", 2);
String[] parameters = new String[6];
if (parts.length > 1) {
parameters = parts[1].split(",");
}
String command = parts[0];

switch (command) {
case "move":
move(board);

break;
case "print": 
Terminal.printLine(printBoard(board));
break;
case "position":
if (checkForParamters(1, 1)) {
Terminal.printLine(getPosition(board, parameters[0]));
}
break;
case "field":
int fieldPosX = Integer.parseInt(parameters[0]);
int fieldPosY = Integer.parseInt(parameters[1]);
String outputString = getField(board, fieldPosX, fieldPosY);
if (outputString != null) {
Terminal.printLine(outputString);
}
break; 
case "direction":
if (checkForParamters(1, 1)) {
Terminal.printLine(getDirectionAnt(board, parameters[0]));
}
break;

case "ant":
Terminal.printLine(getAntsOnBoard(board));
break;
case "create":
if (checkForParamters(parameters.length, 3)) {
int posX = Integer.parseInt(parameters[1]);
int posY = Integer.parseInt(parameters[2]);
createAnt(board, parameters[0], posX, posY);
}
break;
case "escape":
if (checkForParamters(parameters.length, 1)) {
removeAntFromBoard(board, parameters[0]); 
}
break;
case "quit":
isRunning = false;
break;

default : Terminal.printError("Invalid command");

}
}
}

/**
 * Here i take the input from file
 * and count lines and columns 
 * if they match i return the number of colums 
 * and later give it to the constructor of Board like 
 * row and col , because matrix should be quadratic
 * @param inputFileName
 * @return
 * @throws Exception
 */
private int getMatrixSize(String inputFileName)  {

int countLines = 0;
List<String> linesLength = new ArrayList<>();
try {
BufferedReader bfReader = new BufferedReader(new FileReader(inputFileName));
String line = bfReader.readLine();
while (line != null) {
linesLength.add(line);
countLines++;
line = bfReader.readLine();
}
} catch (Exception e) {

}

for (int i = 0; i < linesLength.size(); i++) {
if (countLines != linesLength.get(i).length()) {
Terminal.printError("Matrix must be quadratic");
} else {
return countLines;
}
}
return countLines;

}
/**
 * Here i read from the file and search, where are ants 
 * located by checking if it's letter
 * than i save the value of letter and save the position of the letter
 * in format X , Y, name
 * @param inputFileName
 * @return
 */
private List<String> findAnts(String inputFileName) {

List<String> lines = new ArrayList<>();
try {
BufferedReader br = new BufferedReader(new FileReader(inputFileName));
String line = br.readLine();
while (line != null) {
lines.add(line);
line = br.readLine();
}
} catch (Exception e) {

}

char[] splitLineByLetterOrDigit;
List<String> saveAnts = new ArrayList<>();

for (int k = 0; k < lines.size(); k++) {
String singleLine = lines.get(k);
splitLineByLetterOrDigit = singleLine.toCharArray();
for (int i = 0; i < splitLineByLetterOrDigit.length; i++) {
if (Character.isLetter(splitLineByLetterOrDigit[i])) {
// first is row
saveAnts.add(String.format("%d %d %s", k, i, splitLineByLetterOrDigit[i]));
}
}
}

return saveAnts;
}

/**
 * Here i initialize the board and the ants from the
 * text file
 * @param inputFileName
 * @return
 */
public Board createBoard(String inputFileName) {
List<String> ants = new ArrayList<>();

int rows = 0;
rows = getMatrixSize(inputFileName);

Board b = new Board(rows, rows);

ants = findAnts(inputFileName);
for (int k = 0; k < ants.size(); k++) {
String firstAnt = ants.get(k);
String[] firstAntSplitted = firstAnt.split(" ");
String name = "";
int posX = 0;
int posY = 0;

name = firstAntSplitted[2];
posX = Integer.parseInt(firstAntSplitted[0]);
posY = Integer.parseInt(firstAntSplitted[1]);

Ant a = new Ant(name);


b.placeAnt(posX, posY, a);
}
return b;
}


/**
 * Here i set name and check if it's in the list from
 * ants on board and if it is i remove it
 * ESCAPE
 * @param name
 */
private void removeAntFromBoard(Board inputBoard, String name) {
for (int k = 0; k < inputBoard.getAntsOnBoard().size(); k++) {
String currentName = inputBoard.getAntsOnBoard().get(k).getName();
if (currentName.equalsIgnoreCase(name)) {
int antPosX = inputBoard.getAntsOnBoard().get(k).getAntPosX();
int antPosY = inputBoard.getAntsOnBoard().get(k).getAntPosY();
inputBoard.getAntsOnBoard().remove(k);
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
}
}
}

/**
 * Here i get all names from ants , that are on board
 * sorted by name 
 * ANT
 * @return
 */
private String getAntsOnBoard(Board inputBoard) {

inputBoard.sortAntsName();
String result = "";
for (int k = 0; k < inputBoard.getAntsOnBoard().size(); k++) {
result += inputBoard.getAntsOnBoard().get(k).getName().toLowerCase() + ",";
}

if (inputBoard.getAntsOnBoard().size() == 0) {
result = "Eror: No more ants";
} else {
result = result.substring(0, result.length() - 1);
}
return result;
}

/**
 * Here i check if ant is on board and if it is 
 * i take it's direction
 * DIRECTION
 * @param antName
 * @return
 */
private String getDirectionAnt(Board inputBoard, String antName) {
String dir = "";
for (int p = 0; p < inputBoard.getAntsOnBoard().size(); p++) {
if (antName.equalsIgnoreCase(inputBoard.getAntsOnBoard().get(p).getName())) {
dir = inputBoard.getAntsOnBoard().get(p).getDirection();
}
}
if (dir.isEmpty()) {
Terminal.printError("This ant is not on board");
}
return dir;
}
/**
 * POSITION
 * @param antName
 * @return
 */
private String getPosition(Board inputBoard, String antName) {
String position = "";
for (int k = 0; k < inputBoard.getAntsOnBoard().size(); k++) {
String name = inputBoard.getAntsOnBoard().get(k).getName();
if (name.equalsIgnoreCase(antName)) {
int positionX = inputBoard.getAntsOnBoard().get(k).getAntPosX();
int positionY = inputBoard.getAntsOnBoard().get(k).getAntPosY();
position = positionX + "," + positionY;
} 
}
if (position.isEmpty()) {
Terminal.printError("Ant is not on the board");
}
return position;
}

private void createAnt(Board board, String name, 
int posX, int posY) {
for (int k = 0; k < board.getAntsOnBoard().size(); k++) {
if (board.getAntsOnBoard().get(k).getName().equalsIgnoreCase(name)) {
Terminal.printError("Duplicate name");
return;
}
if (board.getCellCordinates(posX, posY).hasAnt()) {
Terminal.printError("Ant on this position");
return;
}
}

Ant ant = new Ant(name);
board.placeAnt(posX, posY, ant);
}



/**
 * FIELD
 * @param posX
 * @param posY
 * @return
 */

private String getField(Board inputBoard, int posX, int posY) {
String result = "";
if (inputBoard.getCellCordinates(posX, posY) == null) {
return null;
}
if (inputBoard.getCellCordinates(posX, posY).hasAnt()) {
result = inputBoard.getCellCordinates(posX, posY).getAnt().getName().toLowerCase();
} else {
int currentColor = inputBoard.getCellCordinates(posX, posY).getColor(); 
result = Integer.toString(currentColor);
}
return result;

}

private String printBoard(Board inputBoard) {
String result = "";
for (int i = 0; i < inputBoard.getCells().length; i++) {
for (int j = 0; j < inputBoard.getCells()[i].length; j++) {
result += getField(inputBoard, i, j);
}
if (i != inputBoard.getCells().length - 1) {
result += "\n";
}
}
return result;
}

private boolean checkForParamters(int given, int required) {
if (given != required) {
Terminal.printError("Invalid parameters");
return false;
}
if (required == 0) {
Terminal.printError("Please enter parameters");
return false;
}
return true;
}


/**
 * Here i use switch case as i set to every color
 * direction , where to move
 * @param inputBoard
 */
private void move(Board inputBoard) {
SimulationHelper simHelp = new SimulationHelper();
for (int k = 0; k < inputBoard.getAntsOnBoard().size(); k++) {
Ant ant = inputBoard.getAntsOnBoard().get(k);
int antPosX = ant.getAntPosX();
int antPosY = ant.getAntPosY();
int fieldColor = inputBoard.getCellCordinates(antPosX, antPosY).getColor();

switch (fieldColor) {
case 0:
simHelp.moveleftNinty(inputBoard);
break;
case 1:
simHelp.moveRightNinty(inputBoard);
break;
case 2:
simHelp.moveLeftFourtyFive(inputBoard);
break;
case 3:
simHelp.moveRightFourtyFive(inputBoard);
break;
case 4:
simHelp.moveRightNinty(inputBoard);
break;
default: Terminal.printError("Invalid Color");

}
}
}

}