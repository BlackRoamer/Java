package fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TearListInAHalf {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String inputInts = scan.nextLine();
	String[] inputIntsToArr = inputInts.split(" ");
	
	List<Integer> firstList = new ArrayList<Integer>();
	List<Integer> secondList = new ArrayList<Integer>();
	int limit = inputIntsToArr.length / 2;
	for (int i = 0; i < limit; i++) {
		firstList.add(Integer.parseInt(inputIntsToArr[i]));
	}
	
	for (int j = limit; j < inputIntsToArr.length; j++) {
		secondList.add(Integer.parseInt(inputIntsToArr[j]));
		}
	List<Integer> storeDigits = new ArrayList<Integer>();
	for (int k = 0; k < secondList.size(); k++) {
		if (secondList.get(k) >= 10 && secondList.get(k) < 100 ) {
			storeDigits.add((secondList.get(k) / 10));
			storeDigits.add((secondList.get(k) % 10));
		}
	}
			int index = 1;
		for (int k = 0; k < firstList.size(); k++) {
			storeDigits.add(index, firstList.get(k));
			index += 3;
		}
		
		for (int e : storeDigits) {
			System.out.print(e + " ");
		}
	
}
}
