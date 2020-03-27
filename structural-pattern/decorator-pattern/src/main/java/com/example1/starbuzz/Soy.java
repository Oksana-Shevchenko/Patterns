package com.example1.starbuzz;

public class Soy extends CondimentDecorator {
	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Soy";
	}

	@Override
	public float cost() {
		return 0.15f + beverage.cost();
	}
}
