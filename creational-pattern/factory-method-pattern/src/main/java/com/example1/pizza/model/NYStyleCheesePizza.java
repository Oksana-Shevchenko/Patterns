package com.example1.pizza.model;

import com.example1.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		setName("NY Style Sauce and Cheese Pizza");
		setDough("Thin Crust Dough");
		setSauce("Marinara Sauce");
		getToppings().add("Grated Reggiano Cheese");
	}
}
