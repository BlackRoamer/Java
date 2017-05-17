package softuni;

import java.util.Scanner;

public class CypherRoulette {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input number of lines : ");
		int n = scan.nextInt();
		String spin = "spin";
		String duplicatedInput = "";
		String savedInput = "";
		String userInput = "";
		boolean inputAtEndPosition = true;

		for (int i = 0; i < n; i++) {
			duplicatedInput = userInput;
			System.out.println("Input words");
			userInput = scan.next();
			if (userInput.equals(spin)) {
				i--; // spin doesn't count
				inputAtEndPosition = !inputAtEndPosition; //changing position
					if (duplicatedInput.equals(spin)) {
					savedInput = "";
					userInput = "";
					duplicatedInput = "";
				}
				
			} else if (userInput.equals(duplicatedInput)) {
				userInput = "";
				savedInput = "";
				duplicatedInput = "";
			} else {
				if (inputAtEndPosition) {
					savedInput = savedInput + userInput;
				} else {
					savedInput = userInput + savedInput;
				}
			}
			
		}
		System.out.println(savedInput);
	}
}
