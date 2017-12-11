package game;

import java.util.HashSet;
import java.util.Set;

public class Player {

    private char playerSymbol;
    private int[] playerMoves;

    public Player(char playerSymbol) {
	this.playerSymbol = playerSymbol;

    }

    public char getPlayerSymbol() {
	return playerSymbol;
    }

    public void setPlayerSymbol(char playerSymbol) {
	this.playerSymbol = playerSymbol;
    }

    public int[] getPlayerMoves() {
	return playerMoves;
    }

    public void setPlayerMoves(int[] playerMoves) {
	if (playerMoves.length != 4 && playerMoves.length != 5) {
	    try {
		throw new Exception("Invalid number of moves");
	    } catch (Exception e) {
		System.out.println(e.getMessage());
	    }
	} else {
	    this.playerMoves = playerMoves;
	}
    }

    public void takePlayerOneMoves(String input) {
	String[] splittedInput = input.split(" ");
	int[] parsedInput = new int[splittedInput.length];
	int len = (splittedInput.length / 2) + 1;
	int[] playerOnemoves = new int[len];
	int index = 0;
	for (int i = 0; i < splittedInput.length; i++) {
	    parsedInput[i] = Integer.parseInt(splittedInput[i]);
	}
	for (int i = 0; i < parsedInput.length; i++) {
	    if (i % 2 == 0) {
		playerOnemoves[index] = parsedInput[i];
		index++;
	    }
	}
	setPlayerMoves(playerOnemoves);
    }

    public void takePlayerTwoMoves(String input) {
	String[] splittedInput = input.split(" ");
	int[] parsedInput = new int[splittedInput.length];
	int len = splittedInput.length / 2;
	int[] playerTwomoves = new int[len];
	int index = 0;
	for (int i = 0; i < splittedInput.length; i++) {
	    parsedInput[i] = Integer.parseInt(splittedInput[i]);
	}
	for (int i = 0; i < parsedInput.length; i++) {
	    if (i % 2 == 1) {
		playerTwomoves[index] = parsedInput[i];
		index++;
	    }
	}
	setPlayerMoves(playerTwomoves);
    }

    public static void checkInput(String input) {
	String[] splittedInput = input.split(" ");
	int[] parsedInput = new int[splittedInput.length];
	Set<Integer> removeDuplicates = new HashSet<Integer>();
	for (int i = 0; i < splittedInput.length; i++) {
	    if (parsedInput[i] < 0 || parsedInput[i] > 8) {
		try {
		    throw new Exception("The moves must be between 0 and 8");
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		}
	    } else {
		parsedInput[i] = Integer.parseInt(splittedInput[i]);
		removeDuplicates.add(parsedInput[i]);
	    }
	}
	if (parsedInput.length != removeDuplicates.size()) {
	    try {
		throw new Exception("There are duplicated positions");
	    } catch (Exception e) {
		System.out.println(e.getMessage());
	    }
	}
    }
}
