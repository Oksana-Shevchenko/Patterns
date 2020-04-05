package com.example3.holeandpeg;

import lombok.Getter;

@Getter
public class SquarePeg {
	private double width;

	public SquarePeg(double width) {
		this.width = width;
	}

	public double getSquare() {
		return Math.pow(this.width, 2);
	}
}
