package com.example1.pizza.model;

import com.example1.pizza.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		setName("Chicago Style Deep Dish Clam Pizza");
		setDough("Extra Thick Crust Dough");
		setSauce("Tomato Sauce");
		getToppings().add("Shredded Mozzarella Cheese");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
