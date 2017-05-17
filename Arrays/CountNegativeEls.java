package softuni;

import java.util.Scanner;

public class CountNegativeEls {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int n = scan.nextInt();
	
	int[] numbers = new int[n];
	int count = 0;
	for (int i = 0; i < numbers.length; i++) {
		numbers[i] = scan.nextInt();
		
		if (numbers[i] < 0) {
			count++;
		}
	}
	System.out.println(count);
}
}
