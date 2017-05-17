package softuni;

import java.util.Scanner;

public class CountCappitalLetters {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	String line = scan.nextLine();
	
	String[] words = line.split(" ");
	int counter = 0;

	for (int i = 0; i < words.length; i++) {
		String currentWord = null;
		
		currentWord = words[i];
		if (currentWord.length() == 1) {
			char character = currentWord.charAt(0);
			
			if (character >= 'A' && character <= 'Z') {
				counter++;
			}
		}
		
	}
	
	
	System.out.println(counter);
}
}
