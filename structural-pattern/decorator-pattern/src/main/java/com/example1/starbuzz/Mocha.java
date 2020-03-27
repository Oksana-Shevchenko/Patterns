package com.example1.starbuzz;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Mocha";
	}

	@Override
	public float cost() {
		return 0.20f + beverage.cost();
	}
}
