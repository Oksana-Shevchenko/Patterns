package com.example1.starbuzz;

public class Whip extends CondimentDecorator {
	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Whip";
	}

	@Override
	public float cost() {
		return 0.25f + beverage.cost();
	}
}
