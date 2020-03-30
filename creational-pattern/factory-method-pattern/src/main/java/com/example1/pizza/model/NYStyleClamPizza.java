package com.example1.pizza.model;

import com.example1.pizza.Pizza;

public class NYStyleClamPizza extends Pizza {
	public NYStyleClamPizza() {
		setName("NY Style Sauce and Calm Pizza");
		setDough("Thin Crust Dough");
		setSauce("Tomato Sauce");
		getToppings().add("Grated Reggiano Cheese");
	}
}
