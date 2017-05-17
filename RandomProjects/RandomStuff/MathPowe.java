package softuni;

import java.util.Scanner;

public class MathPowe {
public static void main(String[] args) {
	Scanner  scan = new Scanner(System.in);
	double number =  scan.nextDouble();
	int power = scan.nextInt();
	double raisedNumber = raisingNumber(number, power);
	System.out.println(raisedNumber);
} 
private static double raisingNumber(double number, int power) {
	double result = 1;
	for (int i = 1; i <= power; i++) {
		result *= number;
	}
	return result;
}
}
