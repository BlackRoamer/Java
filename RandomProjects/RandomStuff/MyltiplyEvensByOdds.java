package softuni;

import java.util.Scanner;

public class MyltiplyEvensByOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		long result = multiply(number);
		System.out.println(result);
		
	}
	private static long multiply (int num) {
		int sumEvens = isEven(num);
		int sumOdds = isOdd(num);
		long result = sumEvens * sumOdds;
		return result;
	}
	private static int isEven(int num) {
		int digit = 0;
		int localnum = Math.abs(num);
		while (localnum > 0) {
			int savedNumber = localnum % 10;
			if (savedNumber % 2 == 0) {
				digit += savedNumber;
			}
			localnum = localnum / 10;
			
		}
		return digit;
	}
	private static int isOdd(int num) {
		int digit = 0;
		int localnum = Math.abs(num);
		while (localnum > 0) {
			int savedNumber = localnum % 10;
			if (savedNumber % 2 != 0) {
				digit += savedNumber;
			}
			localnum = localnum / 10;
			
		}
		return digit;
	}
}
