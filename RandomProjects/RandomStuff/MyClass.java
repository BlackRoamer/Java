package softuni;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are you ?");
		byte years = scan.nextByte();
		int days = years * 365;
		int months = days / 30; 
		int hours = days * 24; 
		int minutes = hours * 60; 
		String monthDecription = "The monthvalue is roughly , because we ignore the leap years "
				+ "and we take , that every month have 30days";
		System.out.println("Years = " + years + '\n' + "Months = "
				+  months + '\n' + monthDecription 
				+ '\n' + "Days = " + days + '\n' + 
				"Hours = " + hours + '\n' + "Minutes = " + minutes);
		
	}

}
