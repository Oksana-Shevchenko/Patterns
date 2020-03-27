package com.example1.starbuzz;

public class Demo {
	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " $" + espresso.cost());

		Beverage beverage = new DarkRoast();
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}
}
