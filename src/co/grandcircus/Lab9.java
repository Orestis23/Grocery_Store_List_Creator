package co.grandcircus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> itemsOrderedNames = new ArrayList<String>();
		ArrayList<Double> itemsOrderedPrices = new ArrayList<Double>();
		System.out.println("Welcome to Rusty's store");
		System.out.println("Would you like to order items? (y/n)");
		char userChar = scan.next().charAt(0);
		scan.nextLine();

		Map<String, Double> items = new HashMap<String, Double>();

		do {

			items.put("an apple", .99);
			items.put("a banana", .59);
			items.put("cauliflower", 1.59);
			items.put("dragonfruit", 2.19);
			items.put("an Elderberry", 1.79);
			items.put("figs", 2.09);
			items.put("a grapefruit", 1.99);
			items.put("honeydew", 3.49);

			System.out.println("Item\t\t\t\tPrice");
			System.out.println("======================================");
			System.out.println(displayMenu(items));
			System.out.println("What item would you like to order?");
			String choice = scan.nextLine();

			itemsOrderedNames.add(choice);

			itemsOrderedPrices.add(items.get(choice));

			System.out.println("You ordered " + choice + ", and it costs " + items.get((choice)));
			System.out.println("Would you like to order any other items? (y/n)");
			userChar = scan.nextLine().charAt(0);

		} while (userChar == 'y');

		System.out.println("Thank you for shopping at Rusty's!");
		System.out.println("You ordered: ");
		Iterator itemItr = itemsOrderedNames.iterator();
		Iterator priceItr = itemsOrderedPrices.iterator();

		while (itemItr.hasNext()) {
			String itemName = (String) itemItr.next();
			Double priceAmt = (Double) priceItr.next();

			System.out.println(itemName + " " + priceAmt);

		}

		double pricesTotal = 0.0;

		for (int i = 0; i < itemsOrderedPrices.size(); i++) {
			pricesTotal += itemsOrderedPrices.get(i);
		}
		System.out.println("The total value of your order is: " + pricesTotal);

		double pricesAverage = pricesTotal / itemsOrderedPrices.size();

		String pricesAvg = String.format("%.2f", pricesAverage);
		System.out.println("The average price of the items you bought is: " + pricesAvg);

		Double i = Collections.max(itemsOrderedPrices);
		System.out.println("The index of the highest price is: " + itemsOrderedPrices.indexOf(i));

		Double c = Collections.min(itemsOrderedPrices);
		System.out.println("The index of the lowest price is: " + itemsOrderedPrices.indexOf(c));
	}

	public static String displayMenu(Map<String, Double> items) {
		StringBuilder result = new StringBuilder();
		for (String key : items.keySet()) {

			String tabs = "\t\t\t";
			if (key.length() < 7) {
				tabs += "\t";

			}
			result.append(key + tabs + items.get(key) + "\n");

		}
		return result.toString();
	}

}
