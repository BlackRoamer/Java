package softuni;

import java.util.Scanner;

public class CirclePer {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double pi = Math.PI;
	System.out.println("Enter radius : ");
	double radius = scan.nextDouble();
	double result = radius * radius * pi;
	String resultStr = String.format("%.12f",result);
	String resultTwoDecimal  = String.format("%.2f", result);
	System.out.println("Result to 12 decimal");
	System.out.println(resultStr);
	System.out.println("Result to 2 decimal");
	System.out.println(resultTwoDecimal);
}
}
