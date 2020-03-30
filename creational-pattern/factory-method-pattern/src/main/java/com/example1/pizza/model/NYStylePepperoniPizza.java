package com.example1.pizza.model;

import com.example1.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {
	public NYStylePepperoniPizza() {
		setName("NY Style Sauce and Pepperoni Pizza");
		setDough("Thin Crust Dough");
		setSauce("Tomato Sauce");
		getToppings().add("Grated Reggiano Cheese");
	}
}
