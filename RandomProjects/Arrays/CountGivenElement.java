package softuni;

import java.util.Scanner;

public class CountGivenElement {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String inputNumbers = scan.nextLine();
	String[] numbers = inputNumbers.split(" ");
	
	int[] numbersInInt = new int[numbers.length];
	
	for (int i = 0; i < numbers.length; i++) {
		numbersInInt[i] = Integer.parseInt(numbers[i]);
	}
	
	int n = scan.nextInt();
	int counter = 0;
	
	for (int j = 0; j < numbersInInt.length; j++) {
		if (n == numbersInInt[j]) {
			counter++;
		}
	}
	System.out.println(counter);
}
}
