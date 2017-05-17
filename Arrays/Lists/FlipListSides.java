package fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FlipListSides {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	String firstNumsInput = scan.nextLine();
	String[] firstNumsInputToArr = firstNumsInput.split(" ");

	List<Integer> firstNums = new ArrayList<Integer>();

	for (int i = 0; i < firstNumsInputToArr.length; i++) {
		firstNums.add(Integer.parseInt(firstNumsInputToArr[i]));
	}
	if (firstNums.size() % 2 == 0) {
	int limit = firstNums.size() / 2;
	for (int i = 1; i < limit; i++) {
		Collections.swap(firstNums, i, (firstNums.size() - 1) - i);
	}
	} else {
		int middleElement = (firstNums.size() - 1) / 2;
		for (int i = 1; i < middleElement; i++) {
			Collections.swap(firstNums, i, (firstNums.size() - 1) - i);
		}
	}
	
	
//	Collections.swap(firstNums, 0, 5);
//	Collections.swap(firstNums, 3, 4);
	
	
	for (int el : firstNums) {
		System.out.print(el + " ");
	}
}
}
