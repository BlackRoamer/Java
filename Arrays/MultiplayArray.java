package softuni;

import java.util.Scanner;

public class MultiplayArray {
	public static void main(String[] args) {

		// ----- NEW PROGRAMM
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter numbers");
		String enterNumbers = scan.nextLine();
		String[] stringNumbers = enterNumbers.split(" ");
		
		double[] numbers = new double[stringNumbers.length];
		
		for (int i = 0; i < stringNumbers.length; i++) {
			
			numbers[i] = Double.parseDouble(stringNumbers[i]);
			
		}
		
		double[] result = new double[numbers.length]; 
		
		System.out.println("Enter the number p");
		
		double p = scan.nextDouble();

		for (int i = 0; i < result.length; i++) {
			result[i] = numbers[i] * p; 

			System.out.print(result[i] + " ");
		}

	}
}
