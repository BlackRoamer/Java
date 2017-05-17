package softuni;

import java.util.Scanner;

public class FahrenheitToCelsius {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double fahrenheit = scan.nextDouble();
	double celsius = FahrenheitTocelsius(fahrenheit);
	System.out.println(celsius);
}
private static double FahrenheitTocelsius(double fahrenheit) {
	double celsius = (fahrenheit - 32) * 5 / 9;
	return celsius;
}
}
