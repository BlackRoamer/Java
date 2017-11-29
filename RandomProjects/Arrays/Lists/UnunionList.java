package fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UnunionList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String primalNums = scan.nextLine();
		String[] primalNumsToArr = primalNums.split(" ");

		List<Integer> primalList = new ArrayList<Integer>();

		for (int i = 0; i < primalNumsToArr.length; i++) {
			primalList.add(Integer.parseInt(primalNumsToArr[i]));
		}

		String linesNumber = scan.nextLine();
		int limit = Integer.parseInt(linesNumber);

		for (int i = 0; i < limit; i++) {
			String inputNumsForLists = scan.nextLine();
			String[] inputNumsForListsToArr = inputNumsForLists.split(" ");
			List<Integer> tempList = new ArrayList<Integer>();
			List<Integer> tempList2 = new ArrayList<Integer>();
			for (int j = 0; j < inputNumsForListsToArr.length; j++) {
				tempList.add(Integer.parseInt(inputNumsForListsToArr[j]));
			}
			tempList2.addAll(primalList);
			primalList.removeAll(tempList);
			tempList.removeAll(tempList2);
			primalList.addAll(tempList);

		}

		Collections.sort(primalList);

		for (int el : primalList) {
			System.out.print(el + " ");
		}

	}
}
