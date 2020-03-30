package com.example1.pizza.model;

import com.example1.pizza.PizzaIngredientFactory;

public class VeggiePizza extends com.example1.pizza.Pizza {
	private PizzaIngredientFactory ingredientFactory;

	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing "+ getName());
		setDough(ingredientFactory.createDough());
		setSauce(ingredientFactory.createSauce());
		setVeggies(ingredientFactory.createVeggies());
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
