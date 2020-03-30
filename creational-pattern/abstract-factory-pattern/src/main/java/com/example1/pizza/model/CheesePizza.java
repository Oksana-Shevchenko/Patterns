package com.example1.pizza.model;

import com.example1.pizza.Pizza;
import com.example1.pizza.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;

	public CheesePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing "+ getName());
		setDough(ingredientFactory.createDough());
		setSauce(ingredientFactory.createSauce());
		setCheese(ingredientFactory.createCheese());
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
