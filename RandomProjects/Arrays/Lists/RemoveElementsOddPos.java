package fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveElementsOddPos {
public static void main(String[] args) {
	List<String> storeStrings = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	
	String addingElements = scan.nextLine();
	String[] addElementToArr = addingElements.split(" ");
	// Elements start from position 1 , not 0 
	for (int i = 0; i < addElementToArr.length; i++) {
	if (i % 2 == 1) {
	storeStrings.add(addElementToArr[i]);
	}
	}
	for (String listItems : storeStrings) {
		System.out.print(listItems);
	}
}
}
