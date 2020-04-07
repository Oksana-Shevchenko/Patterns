package com.example1.beverage;

public class Demo {
	public static void main(String[] args) {
		CaffeineBeverage tea = new Tea();
		CaffeineBeverage coffee = new Coffee();

		System.out.println("\n Making tea...");
		tea.prepareRecipie();

		System.out.println("\n Making coffee...");
		coffee.prepareRecipie();
	}
}
