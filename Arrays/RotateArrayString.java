package softuni;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class RotateArrayString {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String inputLine = scan.nextLine();
	String[] arrText = inputLine.split(" ");

	String[] arrStore = new String[arrText.length];

	arrStore[0] = arrText[arrText.length - 1];
	for (int i = 0; i < arrText.length - 1; i++) {
		arrStore[i+1] = arrText[i];
			}
	for (int j = 0; j < arrStore.length; j++) {
		System.out.print(arrStore[j] + " ");	
	}
	
}
}
