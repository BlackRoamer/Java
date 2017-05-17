package softuni;

import java.security.AllPermission;
import java.util.Scanner;

public class SequenceOfElements {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	String inputNumbers = scan.nextLine();
	String[] numbers = inputNumbers.split(" ");
	
	int[] numbersToInt = new int[numbers.length];
	
	for (int i = 0; i < numbers.length; i++) {
		numbersToInt[i] = Integer.parseInt(numbers[i]);
	}
	
	String result = "";
	
	int previousNum = numbersToInt[0];
	boolean areAllEqual = true;
	
	for (int j = 1; j < numbersToInt.length - 1; j++) {
		if (numbersToInt[j] <= previousNum) {
			
			areAllEqual = false;
			break;
		}
		previousNum = numbersToInt[j];
		}
	if (areAllEqual) {
		result = "Yes";
	} else {
		result = "No";
	}
	
	System.out.println(result);
		
	}
	
}
