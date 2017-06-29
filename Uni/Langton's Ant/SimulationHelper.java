package edu.kit.informatik;

public class SimulationHelper {

/**
 * Here i use the Direction to move through the board
 * @param inputBoard
 */
public void moveleftNinty(Board inputBoard) {
for (int k = 0; k < inputBoard.getAntsOnBoard().size(); k++) {
Ant ant = inputBoard.getAntsOnBoard().get(k);
int antPosX = ant.getAntPosX();
int antPosY = ant.getAntPosY();
String direction = ant.getDirection();

inputBoard.getCellCordinates(antPosX, antPosY)
.changeColor(inputBoard.getCellCordinates(antPosX, antPosY).getColor());

switch (direction) {

case "N":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosX--;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.E.name());
break;

case "W":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosY++;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.N.name());
break;
case "S":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosX++;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.W.name());
break;

case "E":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosY--;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.S.name());
break;
default: break;
}

}
}

/**
 * Here i use the Direction to move through the board
 * @param inputBoard
 */
public void moveRightNinty(Board inputBoard) {
for (int k = 0; k < inputBoard.getAntsOnBoard().size(); k++) {
Ant ant = inputBoard.getAntsOnBoard().get(k);
int antPosX = ant.getAntPosX();
int antPosY = ant.getAntPosY();
String direction = ant.getDirection();

inputBoard.getCellCordinates(antPosX, antPosY)
.changeColor(inputBoard.getCellCordinates(antPosX, antPosY).getColor());

switch (direction) {

case "N":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosX--;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.W.name());
break;

case "W":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosY++;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.S.name());
break;
case "S":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosX++;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.E.name());
break;

case "E":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosY--;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.N.name());
break;
default: break;
}

}
}

/**
 * Here i use the Direction to move through the board
 * @param inputBoard
 */
public void moveRightFourtyFive(Board inputBoard) {
for (int k = 0; k < inputBoard.getAntsOnBoard().size(); k++) {
Ant ant = inputBoard.getAntsOnBoard().get(k);
int antPosX = ant.getAntPosX();
int antPosY = ant.getAntPosY();
String direction = ant.getDirection();

inputBoard.getCellCordinates(antPosX, antPosY)
.changeColor(inputBoard.getCellCordinates(antPosX, antPosY).getColor());

switch (direction) {

case "N":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosX--;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.NW.name());
break;

case "NW":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosX--;
//antPosY++;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.W.name());
case "W":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosY++;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.SW.name());
break;
case "SW":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosX++;
antPosY++;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.S.name());
break;
case "S":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosX++;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.SE.name());
break;

case "SE":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosX++;
antPosY--;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.E.name());
break;

case "E":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosY--;
antPosX--;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.N.name());
break;

default: break;
}

}
}

/**
 * Here i use the Direction to move through the board
 * @param inputBoard
 */
public void moveLeftFourtyFive(Board inputBoard) {
for (int k = 0; k < inputBoard.getAntsOnBoard().size(); k++) {
Ant ant = inputBoard.getAntsOnBoard().get(k);
int antPosX = ant.getAntPosX();
int antPosY = ant.getAntPosY();
String direction = ant.getDirection();

inputBoard.getCellCordinates(antPosX, antPosY)
.changeColor(inputBoard.getCellCordinates(antPosX, antPosY).getColor());

switch (direction) {

case "N":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosX--;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.NE.name());
break;

case "NE":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosX--;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.E.name());
case "E":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosY--;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.SE.name());
break;
case "SE":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosX++;
antPosY--;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.S.name());
break;
case "S":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosX++;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.SW.name());
break;

case "SW":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosX++;
antPosY++;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.W.name());
break;

case "W":
inputBoard.getCellCordinates(antPosX, antPosY).removeAnt();
inputBoard.getAntsOnBoard().remove(k);
antPosY++;
antPosX--;
inputBoard.placeAnt(antPosX, antPosY, ant);
ant.setDirection(Direction.N.name());
break;

default: break;
}

}
}
}