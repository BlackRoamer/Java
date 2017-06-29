package edu.kit.informatik;

public class Cell {

private int posX = 0;
private int posY = 0;
private int color = 0;
private Ant ant = null;
private boolean isCellFree = true;

public Cell(int posX, int posY) {
this.posX = posX;
this.posY = posY;
}

public int getPosY() {
return posY;
}

public int getPosX() {
return posX;
}

public int getColor() {
return color;
}

public void changeColor(int color) {
int newColor = -1;
if (color >= 0 && color <= 4) {

newColor = (4 * color + 23) % 5;
this.color = newColor;
} else {
Terminal.printError("Invalid color");
}

}

public void placeAnt(Ant ant) {
if (hasAnt()) {
Terminal.printError("Existing ant on this position");
} else {
this.ant = ant;
isCellFree = false;
}
}

public void removeAnt() {

if (!hasAnt()) {
Terminal.printError("No ants on this position");
} else {
this.ant = null;
isCellFree = true;
}
}

public boolean hasAnt() {
return !isCellFree; //FALSE
}

public Ant getAnt() {
return ant;
}

}