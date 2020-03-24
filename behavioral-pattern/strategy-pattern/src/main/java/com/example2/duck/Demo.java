package com.example2.duck;

import com.example2.duck.model.*;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	@SneakyThrows
	public static void main(String[] args) {
		String continueChoice;
		Duck duck = null;
		do {
			System.out.print("Please, select a type of duck:" + "\n" +
					"1 - MallardDuck" + "\n" +
					"2 - RedheadDuck" + "\n" +
					"3 - RubberDuck" + "\n" +
					"4 - DecoyDuck" + "\n");
			int choice = Integer.parseInt(reader.readLine());

			if (choice > 4 || choice < 1) {
				System.out.print("Wrong choice, try again ");
				continueChoice = "Y";
				continue;
			}
			if (choice == 1) {
				duck = new MallardDuck();
				duck.setFlyBehaviour(new FlyWithWings());
				duck.setQuackBehaviour(new Quack());
			}
			if (choice == 2) {
				duck = new RedheadDuck();
				duck.setFlyBehaviour(new FlyWithWings());
				duck.setQuackBehaviour(new Quack());
			}
			if (choice == 3) {
				duck = new RubberDuck();
				duck.setFlyBehaviour(new FlyNoWay());
				duck.setQuackBehaviour(new Squeak());
			}
			if (choice == 4) {
				duck = new DecoyDuck();
				duck.setFlyBehaviour(new FlyNoWay());
				duck.setQuackBehaviour(new MuteQuack());
			}
			duck.display();
			duck.performFly();
			duck.performQuack();
			System.out.print("Do you wish to continue selecting products? Y/N: ");
			continueChoice = reader.readLine();
		} while (continueChoice.equalsIgnoreCase("Y"));

	}
}
