package fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CamelsBack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String inputNums = scan.nextLine();
		String[] inputNumsToArr = inputNums.split(" ");

		List<Integer> listOfNums = new ArrayList<Integer>();

		for (int i = 0; i < inputNumsToArr.length; i++) {
			listOfNums.add(Integer.parseInt(inputNumsToArr[i]));
		}

		int camelBack = scan.nextInt();
		int limit = (listOfNums.size() - camelBack) / 2;
		for (int k = 0; k < limit; k++) {
			listOfNums.remove((listOfNums.size() - 1));
			listOfNums.remove(0);

		}

		if (limit == 0) {

			System.out.print("already stable: ");
			for (int el : listOfNums) {
				System.out.print(el + " ");
			}
		} else {
			System.out.println(limit + " rounds");
			System.out.print("remaining: ");
			for (int el : listOfNums) {
				System.out.print(el + " ");
			}

		}
	}
}
