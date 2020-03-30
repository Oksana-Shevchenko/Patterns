package com.example1.pizza;

import com.example1.pizza.ingredients.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pizza {
	private String name;
	private Dough dough;
	private Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clam clam;

	public abstract void prepare();

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
