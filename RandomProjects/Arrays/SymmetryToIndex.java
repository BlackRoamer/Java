package softuni;

import java.util.Scanner;

import javax.swing.JSpinner.NumberEditor;

public class SymmetryToIndex {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String enterNumbers = scan.nextLine();
	String[] numbers = enterNumbers.split(" ");
	
	int[] numbersToInt = new int[numbers.length];
	
	for (int i = 0; i < numbers.length; i++) {
		numbersToInt[i] = Integer.parseInt(numbers[i]);
	}
	
	int[] result = new int[numbersToInt.length];
	
	for (int j = 0; j < numbersToInt.length; j++) {
		
		if (numbersToInt[j] == j) {
			result[j] = j;	
			System.out.print(result[j] + " ");
		} 
		
	}
	
}
}
