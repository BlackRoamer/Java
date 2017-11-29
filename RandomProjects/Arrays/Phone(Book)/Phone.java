package softuni;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Phone {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String inputNumbers = scan.nextLine();
		String[] phoneNumbers = inputNumbers.split(" ");

		String inputNames = scan.nextLine();
		String[] names = inputNames.split(" ");

		long[] phoneNumbersToInt = new long[phoneNumbers.length];
		for (int i = 0; i < phoneNumbers.length; i++) {
			phoneNumbersToInt[i] = Long.parseLong(phoneNumbers[i].replaceAll("[^\\w\\s]", ""));
			// Long.parseLong(phoneNumbers[i].replaceAll("[^0-9]", ""));
			// Regex to ignore all chars
		}

		String input = scan.nextLine();

		while (!input.equals("done")) {

			String[] command = input.split(" ");
			String command1 = command[0];

			if (command1.equals("call")) {
				callPerson(phoneNumbersToInt, phoneNumbers, names, command[1]);
			}

			if (command1.equals("message")) {
				messagePerson(phoneNumbersToInt, phoneNumbers, names, command[1]);
			}

			input = scan.nextLine();
		}
	}

	private static void messagePerson(long[] phoneNumbersToInt, String[] phoneNumbers, String[] names, String input) {
		for (int i = 0; i < phoneNumbersToInt.length; i++) {

			if (input.equals(names[i])) {
				System.out.println("sending sms to " + phoneNumbers[i] + "...");

				if (difOfDigits(phoneNumbersToInt[i]) % 2 == 0) {
					System.out.println("meet me there");

				} else {
					System.out.println("busy");
				}
			}
			if (input.equals(phoneNumbers[i])) {
				System.out.println("sending sms to " + names[i] + "...");

				if (difOfDigits(phoneNumbersToInt[i]) % 2 == 0) {
					System.out.println("meet me there");

				} else {
					System.out.println("busy");
				}
			}
		}
	}

	private static void callPerson(long[] phoneNumbersToInt, String[] phoneNumbers, String[] names, String input) {
		// TODO Auto-generated method stub
		for (int i = 0; i < phoneNumbersToInt.length; i++) {

			if (input.equals(names[i])) {
				System.out.println("calling " + phoneNumbers[i] + "...");

				if (sumOfDigits(phoneNumbersToInt[i]) % 2 != 1) {
					System.out.println("call ended. duration: " + secondsToString(sumOfDigits(phoneNumbersToInt[i])));

				} else {
					System.out.println("no answer");
				}
			}

			if (input.equals(phoneNumbers[i])) {
				System.out.println("calling " + names[i] + "...");

				if (sumOfDigits(phoneNumbersToInt[i]) % 2 != 1) {

					System.out.println("call ended. duration: " + secondsToString(sumOfDigits(phoneNumbersToInt[i])));

				} else {
					System.out.println("no answer");
					;
				}
			}
		}

	}

	private static void findNumber(String[] phoneNumbers, String[] names, String inputNames) {
		// TODO Auto-generated method stub
		for (int i = 0; i < names.length; i++) {

			if (inputNames.equals(names[i])) {
				System.out.println(names[i] + " -> " + phoneNumbers[i]);
			}
		}
	}

	private static int difOfDigits(long num) {
		int dif = 0;
		while (num > 0) {
			dif -= num % 10;
			num = num / 10;
		}
		return dif;
	}

	private static int sumOfDigits(long num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		return sum;
	}

	private static String secondsToString(long num) {
		return String.format("%02d:%02d", num / 60, num % 60);
	}
}
