package softuni;

import java.util.Scanner;

public class CountOccurenceLargerNum {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String inputNums = scan.nextLine();
	String[] numbers = inputNums.split(" ");
	
	double[] numbersToDoubles = new double[numbers.length];
	
	for (int i = 0; i < numbers.length; i++) {
		numbersToDoubles[i] = Double.parseDouble(numbers[i]);
	}
	
	double p = scan.nextDouble();
	int counter = 0;
	
	
	for (int j = 0; j < numbersToDoubles.length; j++) {
		if (p < numbersToDoubles[j]) {
			counter++;
		}
	}
	System.out.println(counter);
}
}
