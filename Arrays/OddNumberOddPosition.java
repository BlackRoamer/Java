package softuni;

import java.util.Scanner;

public class OddNumberOddPosition {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String inputNumbers = scan.nextLine();
	String[] numbers = inputNumbers.split(" ");
	int[] transformNumbersInInt = new int[inputNumbers.length()];
	
	for (int i = 0; i < numbers.length; i++) {
		transformNumbersInInt[i] = Integer.parseInt(numbers[i]);
	}
	
	for (int j = 0; j < transformNumbersInInt.length; j++) {
		 if (j % 2 == 1 && Math.abs(transformNumbersInInt[j] % 2 )== 1) {
			 System.out.println("Index " + j + " -> " + transformNumbersInInt[j]);
		 } 
	}
}
}
