package fundamentals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class OweMoney {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		List<String> firstPersonsNames = new ArrayList<>();
		List<String> secondPersonsNames = new ArrayList<>();
		HashMap<String, Integer> storedOwedMoneyForPerson = new HashMap<>();
		HashMap<String, Integer> storePersonWaitingForMoney = new HashMap<String, Integer>();
		while (!input.equals("end")) {

			String[] splittedInput = input.split(" ");
			String firstPerson = splittedInput[0];

			String secondPerson = splittedInput[1];
			
			String stringMoney = splittedInput[splittedInput.length - 1];

			try {
				int money = Integer.parseInt(stringMoney);
				if (firstPersonsNames.contains(firstPerson)) {
					int allMoney = storedOwedMoneyForPerson.get(firstPerson) + money;
					storedOwedMoneyForPerson.put(firstPerson, allMoney);
				} else {
					storedOwedMoneyForPerson.put(firstPerson, money);
				}
				firstPersonsNames.add(firstPerson);
			} catch (NumberFormatException NFE) {

			}

			try {
				int money = Integer.parseInt(stringMoney);
				if (secondPersonsNames.contains(secondPerson)) {
					int allMoney = storePersonWaitingForMoney.get(secondPerson) + money;
					storePersonWaitingForMoney.put(secondPerson, allMoney);
				} else {
					storePersonWaitingForMoney.put(secondPerson, money);
				}
				secondPersonsNames.add(secondPerson);

			} catch (NumberFormatException NFE) {

			}

			input = scan.nextLine();

		}

		for (String key : storedOwedMoneyForPerson.keySet()) {
			System.out.println(key + " is owing " + storedOwedMoneyForPerson.get(key));
		}
		
		for (String key : storePersonWaitingForMoney.keySet()) {
			System.out.println(key + " is waiting for " +  storePersonWaitingForMoney.get(key));
		}
	}
}
