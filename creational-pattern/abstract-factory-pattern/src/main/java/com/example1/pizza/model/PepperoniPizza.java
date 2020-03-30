package com.example1.pizza.model;

import com.example1.pizza.Pizza;
import com.example1.pizza.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;

	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing "+ getName());
		setDough(ingredientFactory.createDough());
		setSauce(ingredientFactory.createSauce());
		setCheese(ingredientFactory.createCheese());
		setPepperoni(ingredientFactory.createPepperoni());
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}

