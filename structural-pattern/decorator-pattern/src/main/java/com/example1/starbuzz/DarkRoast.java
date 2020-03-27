package com.example1.starbuzz;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		setDescription("DarkRoast");
	}

	@Override
	public float cost() {
		return 0.65f;
	}
}
