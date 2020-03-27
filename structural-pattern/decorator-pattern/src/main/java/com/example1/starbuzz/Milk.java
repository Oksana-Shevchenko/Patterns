package com.example1.starbuzz;

public class Milk extends CondimentDecorator {
	private Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Milk";
	}

	@Override
	public float cost() {
		return 0.12f + beverage.cost();
	}
}
