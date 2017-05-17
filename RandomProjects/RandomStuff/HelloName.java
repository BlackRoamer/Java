package softuni;

import java.util.Scanner;

public class HelloName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		helloName(name);
	}

	private static void helloName(String name) {
		System.out.println("Hello " + name);
	}
}
