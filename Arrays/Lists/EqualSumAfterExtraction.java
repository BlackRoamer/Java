package fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EqualSumAfterExtraction {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String firstInputNums = scan.nextLine();
	String secondInputNums = scan.nextLine();
	
	String[] firstInputNumsToArr = firstInputNums.split(" ");
	String[] secondInputNumsToArr = secondInputNums.split(" ");
	
	List<Integer> firstList = new ArrayList<Integer>();
	List<Integer> secondList = new ArrayList<Integer>();
	
	for (int i = 0; i < firstInputNumsToArr.length; i++) {
		firstList.add(Integer.parseInt(firstInputNumsToArr[i]));
	}
	
	for (int j = 0; j < secondInputNumsToArr.length; j++) {
		secondList.add(Integer.parseInt(secondInputNumsToArr[j]));
	}
	
	for (int k = 0; k < firstList.size(); k++) {
		for (int t = 0; t < secondList.size(); t++) {
			if (firstList.get(k) == secondList.get(t) ) {
				secondList.remove(t);
			}
		}	
	}
	int sum = 0;
	int sum2 = 0;
	for (int p = 0; p < firstList.size(); p++) {
		sum += firstList.get(p);
		
	}
	
	for (int q = 0; q < secondList.size(); q++) {
		sum2 +=secondList.get(q);
	}
	if (sum == sum2) {
	System.out.println("Yes. Sum: " + sum);	
	} 
	if (sum != sum2) {
	int dif = Math.abs(sum - sum2);
	System.out.println("No. Diff: " + dif);
	}
}
}
