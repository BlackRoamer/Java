package edu.kit.informatik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Board {

private Cell[][] cell;
private String rules = "";

private List<Ant> antsOnBoard = new ArrayList<>();

/**
 * Here i initialize the board by given rows and colums
 * 
 * @param rows
 * @param cols
 */
public Board(int rows, int cols) {
if (rows != cols) {
Terminal.printError("Rows and Columns must be equalnumber");
}
if (rows < 0 || cols < 0) {
Terminal.printError("Rows and Columns must be bigger than 0");
}
this.cell = new Cell[rows][cols];
//this.rules = Terminal.readLine();

for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
this.cell[i][j] = new Cell(i, j);
}

}
}

public int getCellPosX(int posX, int posY) {
return cell[posX][posY].getPosX();
}

public int getCellPosY(int posX, int posY) {
return cell[posX][posY].getPosY();
}

public Cell[][] getCells() {
return this.cell;
}

public String getRules() {
return rules;
}

public void setRules(String rules) {
this.rules = rules;
}

public Cell getCellCordinates(int posX, int posY) {

if (posX < 0 || posY < 0 || this.cell.length <= posX || this.cell[posX].length <= posY) {
Terminal.printError("Invalid cell");
return null;
}

return this.cell[posX][posY];
}

/**
 * Here i place ant by taking the cordinates of cell CREATE
 * 
 * @param positon1
 * @param position2
 * @param ant
 */
public void placeAnt(int positon1, int position2, Ant ant) {
Cell c = getCellCordinates(positon1, position2);
if (c != null) {
ant.setAntPosX(positon1);
ant.setAntPosY(position2);
antsOnBoard.add(ant);
c.placeAnt(ant);
}

}

/**
 * Here i remove ant by giving the name of ant i search in the list and if match
 * i remove it
 * 
 * @param name
 */
public void removeAnt(String name) {
for (int k = 0; k < antsOnBoard.size(); k++) {
if (name.equals(antsOnBoard.get(k))) {
antsOnBoard.remove(k);
} else {
Terminal.printError("The ant doesn't exist");
}
}
}

public List<Ant> getAntsOnBoard() {
return antsOnBoard;
}

/**
 * Here i use comparator to sort ants by name
 */
public void sortAntsName() {

Collections.sort(antsOnBoard, new Comparator<Ant>() {

@Override
public int compare(Ant a1, Ant a2) {
String ourAnt1 = a1.getName().toLowerCase();
String ourAnt2 = a2.getName().toLowerCase();
return ourAnt1.compareTo(ourAnt2);

}
});
}

public int[] takeRuleValueToInt(String ruleValue) {
String[] ruleValueSplitted = ruleValue.split("");
int[] valuesToInt = null;
if (ruleValueSplitted.length != 5) {
Terminal.printError("More or less commands");
} else {
valuesToInt = new int[ruleValueSplitted.length];
for (int k = 0; k < valuesToInt.length; k++) {
valuesToInt[k] = Integer.parseInt(ruleValueSplitted[k]);
}
}
return valuesToInt;
}
}

