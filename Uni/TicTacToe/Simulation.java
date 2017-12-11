package game;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {

	/*
	 * Simple Tic-Tac-Toe game, input is from 0 to 8 in 1 line with space
	 * the odd numbers are for player 1 and event for player 2
	 */

	Player pl1 = new Player('X');
	Player pl2 = new Player('O');
	Board board2 = new Board();

	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();

	pl1.takePlayerOneMoves(input);
	pl2.takePlayerTwoMoves(input);
	board2.takePlayers(pl1, pl2);

	board2.print();
	board2.checkForWin(pl1, pl2);

    }
}
