package softuni;

import java.util.Scanner;

public class GreaterOfTwoValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String varType = scan.nextLine();
		switch (varType) {
		case "String": {
			String value1 = scan.nextLine();
			String value2 = scan.nextLine();
			String greater = getMax(value1, value2);
			System.out.println(greater);
			break; 
		}
		case "int": {
			int value1 = scan.nextInt();
			int value2 = scan.nextInt();
			int greater = getMax(value1, value2);
			System.out.println(greater);
			break;
		} 
		case "char": {
			char value1 = scan.next().charAt(0);
			char value2 = scan.next().charAt(0);
			char greater = getMax(value1, value2);
			System.out.println(greater);
			break;
		}
		default: return;
		}
	}
private static String getMax(String value1, String value2) {
	if (value1.compareTo(value2) > 0) {
		return value2;
	}
	else if (value1.compareTo(value2) < 0)  {
		return value1;
	} else {
		return null;
	}
	
}
private static int getMax(int value1, int value2) {
	if (value1 > value2) {
		return value1;
	} 
	
	return value2;
}
private static char getMax(char value1, char value2) {
	if (value1 > value2) {
		return value1;
	}
	
	return value2;
}
}
