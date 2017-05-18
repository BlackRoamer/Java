package fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DistinctList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String inputNums = scan.nextLine();
		String[] inputNumsToArr = inputNums.split(" ");

		List<Integer> listFromNums = new ArrayList<Integer>();
		for (int i = 0; i < inputNumsToArr.length; i++) {
			if (!listFromNums.contains(Integer.parseInt(inputNumsToArr[i]))) {
				listFromNums.add(Integer.parseInt(inputNumsToArr[i]));
			}

		}

		for (int num : listFromNums) {
			System.out.print(num + " ");
		}

	}
}
