package softuni;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] numbers = new int[n];
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			int currentNum = scan.nextInt();
			numbers[i] = currentNum;
			sum += numbers[i];
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Number : " + i + "is " + numbers[i]);
			
		}
		System.out.println("Sum is : " + sum);
	}

}
