package softuni;

import java.util.Scanner;

public class LargestElement {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int n  = scan.nextInt();
	
	int[] numbers = new int[n];
	
	int testNum = Integer.MIN_VALUE;
	
	for (int i = 0; i < numbers.length; i++) {
		numbers[i] = scan.nextInt();
		
		if (numbers[i] > testNum) {
		testNum = numbers[i];
		}
	}
	System.out.println(testNum);
}
}
