package com.example1.menu;

import lombok.Getter;

import java.util.Iterator;

@Getter
public class MenuItem extends MenuComponent {
	private String name;
	private String description;
	private double price;
	private boolean vegetarian;

	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	@Override
	public void print() {
		System.out.print(" " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("     -- " + getDescription());
	}

	public Iterator createIterator() {
		return new NullIterator();
	}
}
