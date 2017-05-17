package softuni;

import java.util.Scanner;

public class GetMinValue {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int number1 = scan.nextInt();
	int number2 = scan.nextInt();
	int number3 = scan.nextInt();
	
	int savedNum1 = getMin(number1, number2);
	int savedNum2 = getMin(number2, number3);
	System.out.println(getMin(savedNum1, savedNum2));
	
}
private static int getMin(int num1, int num2) {
	if (num1 > num2) {
		return num2;
	}
	
	return num1;
}
}
