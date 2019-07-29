package co.grandcircus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NinthLab {

	public static void main(String[] args) {
		// 1. Display welcome message
		Scanner scan = new Scanner(System.in);
		ArrayList<String> itemsOrdered = new ArrayList<String>();
		ArrayList<Double> itemsPrices = new ArrayList<Double>();
		System.out.println("Welcome to Rusty's store");
		System.out.println("Would you like to order items? (y/n)");
		char userChar = scan.next().charAt(0);
		while (userChar == 'y') {
			// 2. Display items & prices
			Map<String, Double> items = new HashMap<String, Double>();
			items.put("apple", .99);
			items.put("banana", .59);
			items.put("cauliflower", 1.59);
			items.put("dragonfruit", 2.19);
			items.put("Elderberry", 1.79);
			items.put("figs", 2.09);
			items.put("grapefruit", 1.99);
			items.put("honeydew", 3.49);
			System.out.println("Item\t\t\t\tPrice");
			System.out.println("======================================");
			System.out.println("What item would you like to order?");
			// System.out.println(displayMenu(items));
			// 3. Prompt user for item from menu/list
			// 4. Get user input/choice
			String choice = scan.nextLine();
			System.out.println("You ordered " + choice + ", and it costs " + items.get((choice)));
			// 5. Add to cart/order
			itemsOrdered.add(choice);
			itemsPrices.add(items.get(choice));

			// System.out.println(displayMenu(items));
		}
		System.out.println("Would you like to order any other items? (y/n)");
		userChar = scan.next().charAt(0);

		// 6. Display items & prices

	}

	public static String displayMenu(Map<String, Double> items) {
		StringBuilder result = new StringBuilder();
		for (String key : items.keySet()) {
			result.append(key + "\t\t\t$" + items.get(key) + "\n");

		}
		return result.toString();
	}
}
