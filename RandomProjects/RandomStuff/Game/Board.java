package spiel;

public class Board {
private Cell[][] cell;
private Player player;
private Target target;
private static final int ROW = 7;
private static final int COL = 7;

public Board() {
this.cell = new Cell[ROW][COL];
for (int i = 0; i < ROW; i++) {
for (int j = 0; j < COL; j++) {
this.cell[i][j] = new Cell(i, j);
}
}
}


public Cell[][] getCell() {
return cell;
}
public Player getPlayer() {
return player;
}
public Target getTarget() {
return target;
}
}
