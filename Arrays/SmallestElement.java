package softuni;

import java.util.Scanner;

public class SmallestElement {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String inputNumbers = scan.nextLine();
	String[] StringNums = inputNumbers.split(" ");
	
	int[] arrIntNums = new int[StringNums.length];
	
	for (int i = 0; i < StringNums.length; i++) {
		arrIntNums[i] = Integer.parseInt(StringNums[i]);
	}
	int minNumber = Integer.MAX_VALUE;
	for (int i = 0; i < arrIntNums.length; i++) {
		if (minNumber >= arrIntNums[i]) {
			minNumber = arrIntNums[i];
		}
		
	}
	
	System.out.println(minNumber);
}
}
