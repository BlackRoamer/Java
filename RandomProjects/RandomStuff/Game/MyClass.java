package spiel;

import java.util.Scanner;

public class MyClass {
public static void main(String[] args) {
Simulation sim = new Simulation();
Board b = new Board();
Player pl1 = new Player();
Target tar = new Target();
sim.setTarget(b, tar);
sim.setPlayer(b, pl1);
int playerPosX = pl1.getPlayerPosX();
int playerPosY = pl1.getPlayerPosY();
int targetPosX = tar.getTarPosX();
int targetPosY = tar.getTarPosY();
System.out.println("Player positon: " + playerPosX + " " + playerPosY);
System.out.println("Target position: " + targetPosX + " " + targetPosY);
System.out.println("Enter direction");
Scanner scan = new Scanner(System.in);
while (!((playerPosX == targetPosX) && (playerPosY == targetPosY))) {
int dir = scan.nextInt();
sim.movePlayer(b, pl1, dir);
playerPosX = pl1.getPlayerPosX();
playerPosY = pl1.getPlayerPosY();
System.out.println("You made " + pl1.counter + " steps");
if (playerPosX < 0 || playerPosY > 7 || playerPosX > 7 || playerPosY < 0) {
System.out.println("You are out of field");
return;
} 
}
if ((playerPosX == targetPosX) && (playerPosY == targetPosY)) {
System.out.println("You win");
} else {
System.out.println("You lost");
}
}
}
