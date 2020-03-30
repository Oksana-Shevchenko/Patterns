package com.example1.pizza;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class Pizza {
	private String name;
	private String dough;
	private String sauce;
	private List<String> toppings = new ArrayList<>();

	public void prepare() {
		System.out.println("Preparing " + getName());
		System.out.println("Tossing dough... " + getDough());
		System.out.println("Adding sauce... " +getSauce());
		System.out.println("Adding toppings:");
		toppings.forEach(System.out::println);
	}
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
}
