package com.example3.holeandpeg;

import lombok.Getter;

@Getter
public class RoundHole {
	private final double radius;

	public RoundHole(double radius) {
		this.radius = radius;
	}

	public boolean fits(RoundPeg peg) {
		return this.getRadius() >= peg.getRadius();
	}
}
