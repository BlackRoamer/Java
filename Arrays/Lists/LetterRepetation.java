package fundamentals;

import java.util.HashMap;
import java.util.Scanner;

public class LetterRepetation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();

		HashMap<Character, Integer> mapOfLetters = new HashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {
			
			char helpChar = input.charAt(i);
			
			if (mapOfLetters.get(helpChar) != null) {
				mapOfLetters.put(helpChar, mapOfLetters.get(helpChar) + 1);
			} else {
				mapOfLetters.put(helpChar, 1);
			}
		}
		System.out.println(mapOfLetters.get('a'));
		for (char key : mapOfLetters.keySet()) {
			String value = mapOfLetters.get(key).toString();
			System.out.println(key + " -> " + value);

		}
	}
}
