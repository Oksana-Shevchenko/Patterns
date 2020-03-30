package com.example1.pizza.model;

import com.example1.pizza.Pizza;
import com.example1.pizza.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing "+ getName());
		setDough(ingredientFactory.createDough());
		setSauce(ingredientFactory.createSauce());
		setClam(ingredientFactory.createClam());
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
