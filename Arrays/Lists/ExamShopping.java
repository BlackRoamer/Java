package fundamentals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ExamShopping {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();

		HashMap<String, Integer> stockProducts = new HashMap<String, Integer>();
		List<String> items = new ArrayList<>();
		List<String> notExistingItems = new ArrayList<>();

		boolean doesntExist = false;

		while (!input.equals("exam time")) {

			String[] splittedInput = input.split(" ");
			String stockCommand = "stock";
			String buyCommand = "buy";
			String item = splittedInput[1];
			String quantityStr = splittedInput[splittedInput.length - 1];

			try {
				int quantity = Integer.parseInt(quantityStr);
				if (splittedInput[0].equals(stockCommand)) {
					if (items.contains(item)) {
						int oldQuantity = stockProducts.get(item);
						int newQuantity = oldQuantity + quantity;
						stockProducts.put(item, newQuantity);
					} else {
						stockProducts.put(item, quantity);
						items.add(item);
					}
				}

				if (splittedInput[0].equals(buyCommand)) {
					if (items.contains(item)) {
						int oldQuantity = stockProducts.get(item);
						if (quantity >= oldQuantity) {
							quantity = oldQuantity;
							stockProducts.replace(item, 0);
						} else if (quantity == 0) {
							System.out.println(item + " out of stock");
						} else {
							int currentQuantity = oldQuantity - quantity;
							stockProducts.replace(item, currentQuantity);
						}

					} else {

						notExistingItems.add(item);

					}

				}

			} catch (NumberFormatException NFE) {
			}

			input = scan.nextLine();

		}
		if (notExistingItems.isEmpty() == false) {
			for (int i = 0; i < notExistingItems.size(); i++) {
				System.out.println(notExistingItems.get(i) + " doesn't exist");
			}
		}
		for (String key : stockProducts.keySet()) {
			System.out.println(key + " -> " + stockProducts.get(key));
		}

	}
}
