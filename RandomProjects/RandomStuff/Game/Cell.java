package spiel;

public class Cell {
private int cordX = 0;
private int cordY = 0;
private boolean isCellFree = true;
private Player player;
private Target target;

public Cell(int row, int col) {
this.cordX = row;
this.cordY = col;
}
public void setPlayer(Player pl,int posX, int posY) {
if (isCellFree) {
this.player = pl;
isCellFree = !isCellFree;
}
}

public void setTarget(Target tar,int posX, int posY) {
if (isCellFree) {
this.target = tar;
isCellFree = !isCellFree;
}
}

public int getCordX() {
return cordX;
}

public int getCordY() {
return cordY;
}

public boolean isCellFree() {
return isCellFree;
}

public void setCellFree(boolean isCellFree) {
this.isCellFree = isCellFree;
}
}
