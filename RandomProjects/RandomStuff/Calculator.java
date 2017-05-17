package softuni;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number :");
	int firtstNumber = scan.nextInt();
	System.out.println("Enter operation");
	String operation = scan.next();
	System.out.println("Enter a number :");
	int secondNumber = scan.nextInt();
	switch (operation) {
	case "+":
		System.out.println("Your answer is : " + (firtstNumber + secondNumber));
		break;
	case "-":
		System.out.println("Your answer is : " + (firtstNumber - secondNumber));
		break;
	case "*":
	System.out.println("Your answer is : " + (firtstNumber * secondNumber));
	break;
	case "/":
	System.out.println("Your answer is : " + (firtstNumber / secondNumber));
	break;
	default:
		System.out.println("Invalid operator");
	}
}
}
