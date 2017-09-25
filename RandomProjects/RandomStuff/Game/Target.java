package spiel;

import java.util.Random;

public class Target {
private int tarPosX = 0;
private int tarPosY = 0;
public Target() {
this.tarPosX = generateCordinates();
this.tarPosY = generateCordinates();
}

private int generateCordinates() {
Random rand = new Random();
int num1 = rand.nextInt(7);
return num1;
}

public int getTarPosX() {
return tarPosX;
}
public void setTarPosX(int tarPosX) {
this.tarPosX = tarPosX;
}
public int getTarPosY() {
return tarPosY;
}
public void setTarPosY(int tarPosY) {
this.tarPosY = tarPosY;
}
}
