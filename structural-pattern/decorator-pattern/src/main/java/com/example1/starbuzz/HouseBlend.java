package com.example1.starbuzz;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		setDescription("HouseBlend");
	}

	@Override
	public float cost() {
		return 0.89f;
	}
}
