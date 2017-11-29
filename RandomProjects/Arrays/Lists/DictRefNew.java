package fundamentals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DictRefNew {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		List<String> storeFirstElements = new ArrayList<>();
		HashMap<String, Integer> storeValues = new HashMap<String, Integer>();
		while (!input.equals("end")) {

			String[] splitInput = input.split(" ");

			String firstElement = splitInput[0];

			String lastElement = splitInput[splitInput.length - 1];
			boolean checkForTry = false;
			try {
				int lastElementToInt = Integer.parseInt(lastElement);
				storeValues.put(firstElement, lastElementToInt);
				checkForTry = true;
				storeFirstElements.add(firstElement);

			} catch (NumberFormatException NFE) {

			}

			if (checkForTry == false) {
				if (storeFirstElements.contains(lastElement)) {
				storeValues.put(firstElement, storeValues.get(lastElement));
				}
			}
			input = scan.nextLine();
		}

		for (String key : storeValues.keySet()) {
			System.out.println(key + " === " + storeValues.get(key));
		}

	}
}

