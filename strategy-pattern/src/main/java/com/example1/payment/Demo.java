package com.example1.payment;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Demo {
	private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static Order order = new Order();
	private static PayStrategy strategy;

	static {
		priceOnProducts.put(1, 2200);
		priceOnProducts.put(2, 1850);
		priceOnProducts.put(3, 1100);
		priceOnProducts.put(4, 890);
	}

	@SneakyThrows
	public static void main(String[] args) {
		while (!order.isClosed()) {
			int cost;

			String continueChoice;
			do {
				System.out.print("Please, select a product:" + "\n" +
						"1 - Mother board" + "\n" +
						"2 - CPU" + "\n" +
						"3 - HDD" + "\n" +
						"4 - Memory" + "\n");
				int choice = Integer.parseInt(reader.readLine());

				if (!priceOnProducts.containsKey(choice)) {
					System.out.print("Wrong choice, try again ");
					continueChoice = "Y";
					continue;
				}

				cost = priceOnProducts.get(choice);
				System.out.print("Count: ");
				int count = Integer.parseInt(reader.readLine());
				order.setTotalCost(cost * count);
				System.out.print("Do you wish to continue selecting products? Y/N: ");
				continueChoice = reader.readLine();
			} while (continueChoice.equalsIgnoreCase("Y"));

			if (strategy == null) {
				System.out.println("Please, select a payment method:" + "\n" +
						"1 - PalPay" + "\n" +
						"2 - Credit Card");
				String paymentMethod = reader.readLine();

				if (paymentMethod.equals("1")) {
					strategy = new PayPalPayment();
				} else {
					strategy = new CreditCardPayment();
				}

				order.processOrder(strategy);
				order.setClosed(true);
			}
		}
	}
}
