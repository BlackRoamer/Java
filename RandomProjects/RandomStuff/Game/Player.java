package spiel;

import java.util.Random;

public class Player {
private int playerPosX = 0;
private int playerPosY = 0;

public int counter = 0;

public Player() {
this.playerPosX = generateCordinates();
this.playerPosY = generateCordinates();
this.counter = 0;
}

private int generateCordinates() {
Random rand = new Random();
int num1 = rand.nextInt(7);
return num1;
}

public int getPlayerPosX() {
return playerPosX;
}

public int getPlayerPosY() {
return playerPosY;
}
public void setPlayerPosX(int playerPosX) {
this.playerPosX = playerPosX;
}

public void setPlayerPosY(int playerPosY) {
this.playerPosY = playerPosY;
}
}
