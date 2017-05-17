package guessGame;

public class GameLauncher {
public static void main(String[] args) {
	Player p1 = new Player ();
	p1.age = 10;
	p1.name = "MaikaTi";
	Player p2 = new Player();
	p2.age = 12;
	p2.name = "Xui";
	Player p3 = new Player();
	p3.age = 19;
	p3.name = "IvanTupaka";
	GuessGameNumbers game = new GuessGameNumbers();
	game.start();
	System.out.println("Player1 is: " + p1.name + " " + "is " +  p1.age + "years old");
	System.out.println("The numbers is:");
	System.out.println(game.numbersForPlayer1);
	System.out.println("Player2 is: " + p2.name + " " + "is " +  p2.age + "years old");
	System.out.println("The numbers is:");
	System.out.println(game.numbersForPlayer2);
	System.out.println("Player3 is: " + p3.name + " " + "is " +  p3.age + "years old");
	System.out.println("The numbers is:");
	System.out.println(game.numbersForPlayer3);
	
	
	
}
}
