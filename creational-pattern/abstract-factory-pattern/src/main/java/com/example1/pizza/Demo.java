package com.example1.pizza;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	@SneakyThrows
	public static void main(String[] args) {
		String continueChoice;

		do {
			System.out.print("Please, select a style of pizza:" + "\n" +
					"1 - Chicago pizza style" + "\n" +
					"2 - NY pizza style" + "\n");
			int choice = Integer.parseInt(reader.readLine());

			if (choice > 2 || choice < 1) {
				System.out.print("Wrong choice, try again ");
				continueChoice = "Y";
				continue;
			}
			PizzaStore pizzaStore = null;
			if (choice == 1) {
				pizzaStore = new ChicagoPizzaStore();
			}
			if (choice ==2) {
				pizzaStore = new NYPizzaStore();
			}

			System.out.print("Please, select a type of pizza:" + "\n" +
					"1 - cheese" + "\n" +
					"2 - pepperoni" + "\n" +
					"3 - calm" + "\n" +
					"4 - veggie" + "\n");
			int pizzaChoice = Integer.parseInt(reader.readLine());
			if (pizzaChoice > 4 || pizzaChoice < 1) {
				System.out.print("Wrong choice, try again ");
				continueChoice = "Y";
				continue;
			}

			if (pizzaChoice ==1) {
				pizzaStore.orderPizza("cheese");
			}
			if (pizzaChoice ==2) {
				pizzaStore.orderPizza("pepperoni");
			}
			if (pizzaChoice ==3) {
				pizzaStore.orderPizza("calm");
			}
			if (pizzaChoice ==4) {
				pizzaStore.orderPizza("veggie");
			}

			System.out.print("Do you wish to continue order the pizza? Y/N: ");
			continueChoice = reader.readLine();
		} while (continueChoice.equalsIgnoreCase("Y"));
	}
}
