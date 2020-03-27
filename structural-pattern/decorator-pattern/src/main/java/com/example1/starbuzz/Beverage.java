package com.example1.starbuzz;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Beverage {
	private String description = "Unknown Beverage";

	public abstract float cost();
}
