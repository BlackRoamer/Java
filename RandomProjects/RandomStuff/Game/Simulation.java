package spiel;


public class Simulation {


public void setPlayer(Board board, Player pl) {
int cordX = pl.getPlayerPosX();
int cordY = pl.getPlayerPosY();
board.getCell()[cordX][cordY].setPlayer(pl, cordX, cordY);
}

public void setTarget(Board board, Target tar) {
int cordX = tar.getTarPosX();
int cordY = tar.getTarPosY();
board.getCell()[cordX][cordY].setTarget(tar, cordX, cordY);
}
public void movePlayer(Board board, Player pl,int direction) {
int posX = pl.getPlayerPosX();
int posY = pl.getPlayerPosY();
switch(direction) {
case 1: // nach oben
pl.counter++;
if (posY < 0) {
System.out.println("Error: You are out of field");
break;
}
posY--;
pl.setPlayerPosY(posY);
board.getCell()[posX][posY].setPlayer(pl, posX, posY);
break;
case 2: // nach unten
pl.counter++;
if (posY > 6) {
System.out.println("Error: You are out of field");
break;
}
posY++;
pl.setPlayerPosY(posY);
board.getCell()[posX][posY].setPlayer(pl, posX, posY);
break;
case 3: // nach links
pl.counter++;
if (posX < 0) {
System.out.println("Error: You are out of field");
break;
}
posX--;
pl.setPlayerPosX(posX);
board.getCell()[posX][posY].setPlayer(pl, posX, posY);
break;
case 4: // nach rechts
pl.counter++;
if (posX > 6) {
System.out.println("Error: You are out of field");
break;
}
posX++;
pl.setPlayerPosX(posX);
board.getCell()[posX][posY].setPlayer(pl, posX, posY);
break;
default: System.out.println("ERROR: Invalid direction");
}
}
}


