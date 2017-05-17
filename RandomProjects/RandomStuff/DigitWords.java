package softuni;

import java.util.Scanner;

public class DigitWords {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number :");
	String digitWord = scan.nextLine();
	double digitNumber1 = Double.parseDouble(digitWord);
	String digitTwoCommas = String.format("%.2f", digitNumber1);
	System.out.println("Double : " + digitTwoCommas);
	
}
}
