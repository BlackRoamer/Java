package game;

public class Board {

    private String[][] board = new String[3][3];
    private int num = 0;

    public Board() {
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j] = String.valueOf(num);
		num++;
	    }
	}
    }

    public String[][] getBoard() {
	return board;
    }

    public void setBoard(String[][] board) {
	this.board = board;
    }

    public void takePlayers(Player pl1, Player pl2) {
	int[] firstPlMoves = pl1.getPlayerMoves();
	String[] firstPlMovesToString = new String[firstPlMoves.length];
	for (int i = 0; i < firstPlMoves.length; i++) {
	    firstPlMovesToString[i] = String.valueOf(firstPlMoves[i]);

	}

	int[] secondPlMoves = pl2.getPlayerMoves();
	String[] secondPlMovesToString = new String[secondPlMoves.length];
	for (int i = 0; i < secondPlMoves.length; i++) {
	    secondPlMovesToString[i] = String.valueOf(secondPlMoves[i]);
	}

	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		for (int k = 0; k < firstPlMovesToString.length; k++) {
		    if (board[i][j].equals(firstPlMovesToString[k])) {
			board[i][j] = String.valueOf(pl1.getPlayerSymbol());
		    }
		}
	    }
	}
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		for (int k = 0; k < secondPlMovesToString.length; k++) {
		    if (board[i][j].equals(secondPlMovesToString[k])) {
			board[i][j] = String.valueOf(pl2.getPlayerSymbol());
		    }
		}
	    }
	}
    }

    public void print() {
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		System.out.print(board[i][j] + " ");
	    }
	    System.out.println();
	}
    }

    public void checkForWin(Player pl1, Player pl2) {
	String pl1Symbol = String.valueOf(pl1.getPlayerSymbol());
	String pl2Symbol = String.valueOf(pl2.getPlayerSymbol());
	boolean isDraw = false;
	boolean row = false;
	boolean col = false;
	boolean diagonal = false;
	diagonal = board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])
		|| board[2][0].equals(board[1][1]) && board[2][0].equals(board[0][2]);
	String result = "";
	for (int i = 0; i < 3; i++) {
	    row = board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]);
	    if (row) {
		if (board[i][0].equals(pl1Symbol)) {
		    result = "Player 1 wins";
		} else {
		    result = "Player 2 wins";
		}
		break;
	    }
	    col = board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i]);
	    if (col) {
		if (board[0][i].equals(pl1Symbol)) {
		    result = "Player 1 wins";
		} else {
		    result = "Player 2 wins";
		}
		break;
	    }
	}
	isDraw = row || col || diagonal;

	if (diagonal) {
	    if (board[1][1].equals(pl1Symbol)) {
		System.out.println("Player 1 wins");
	    } else {
		System.out.println("Player 2 wins");
	    }
	}
	if (!isDraw) {
	    System.out.println("Draw");
	} else if (!diagonal) {
	    System.out.println(result);
	}

    }

}
