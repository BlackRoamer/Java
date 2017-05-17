package softuni;

import java.util.Scanner;

public class SpecialNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int currentNumber1 = scan.nextInt();
		for (int i = 1; i <= currentNumber1; i++) {
			int sumOfDigits = 0;
			int number = i;
		while (number > 0) {
			sumOfDigits += (number % 10);
			number = (number / 10);
		}
		
		if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11) {
			System.out.println("The number " + i + " is special" );
		}
		else {
			System.out.println("The number " + i + " is not a special");
		} 
		
		
	}
	}
}


