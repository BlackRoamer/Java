package softuni;

import java.util.Scanner;

public class PhoneBook {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	String inputPhoneNumber = scan.nextLine();
	String inputNames = scan.nextLine();
	
	String[] names = inputNames.split(" ");
	String[] phoneNumsStr = inputPhoneNumber.split(" ");

	String typeName = scan.nextLine();
	
	while (typeName != "done") {
		
		checkNames(phoneNumsStr, names, typeName);
		typeName = scan.nextLine();
	}
	
	}

private static void checkNames(String[] phoneNumsStr, String[] names, String typeName) {
	// TODO Auto-generated method stub
	for (int i = 0; i < names.length; i++) {
		String result = "";
		if (names[i].equals(typeName)) {
			 result = names[i] + " -> " + phoneNumsStr[i];
			 System.out.println(result);
		}
		
	}
	
}	
}



