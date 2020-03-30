package com.example1.pizza.model;

import com.example1.pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		setName("Chicago Style Deep Dish Pepperoni Pizza");
		setDough("Extra Thick Crust Dough");
		setSauce("Tomato Sauce");
		getToppings().add("Shredded Mozzarella Cheese");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
