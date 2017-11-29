package fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerInsertion {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String inputNums = scan.nextLine();
		String[] inputNumsToArr = inputNums.split(" ");

		List<Integer> listNums = new ArrayList<Integer>();
		for (int i = 0; i < inputNumsToArr.length; i++) {
			listNums.add(Integer.parseInt(inputNumsToArr[i]));
		}

		String enterStr = scan.nextLine();
		while (!enterStr.equals("end")) {
			int parsedIntToStr = Math.abs(Integer.parseInt(enterStr));
			
			int firstDigit = 0;
			int temp = parsedIntToStr;
			while (temp > 0) {
				firstDigit = temp % 10;
				temp = temp / 10;
				
			}
			listNums.add(firstDigit, parsedIntToStr);
			enterStr = scan.nextLine();
		}
		
		for (int el : listNums) {
			System.out.print(el + " ");
		}
		
	}
}
