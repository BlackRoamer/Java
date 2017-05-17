package softuni;

import java.util.Scanner;

public class CountOfOddArr {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	String inputNumber = scan.nextLine();
	String[] numbers = inputNumber.split(" ");
	
	int[] resultNumbers = new int[numbers.length];
	
	for (int i = 0; i < numbers.length; i++) {
		resultNumbers[i] = Integer.parseInt(numbers[i]);
	}
	
	int counter = 0;
	
	for (int j = 0; j < resultNumbers.length; j++) {
		
		if (Math.abs(resultNumbers[j] % 2) == 1) {
			counter++;
		}
	}
	System.out.println(counter);
}
}
