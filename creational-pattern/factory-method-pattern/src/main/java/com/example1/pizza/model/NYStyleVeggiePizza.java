package com.example1.pizza.model;

import com.example1.pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {
	public NYStyleVeggiePizza() {
		setName("NY Style Sauce and Veggie Pizza");
		setDough("Thin Crust Dough");
		setSauce("Tomato Sauce");
		getToppings().add("Grated Reggiano Cheese");
	}
}
