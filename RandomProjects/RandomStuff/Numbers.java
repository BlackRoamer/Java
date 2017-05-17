package softuni;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		checkPositive(number);
	}
	private static void checkPositive(int n) {
		if (n > 0) {
			System.out.println("The number " + n + " is positive");
		}
		else if (n < 0) {
			System.out.println("The number " + n + " is negative");
		}	else {
			System.out.println("The number " + n + " is zero");
			}
		}
	}


