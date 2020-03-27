package com.example1.starbuzz;

public class Decaf extends Beverage {
	public Decaf() {
		setDescription("Decaf");
	}

	@Override
	public float cost() {
		return 1.60f;
	}
}
