package com.example3.holeandpeg;

public class SquarePegAdapter extends RoundPeg  {
	private SquarePeg squarePeg;

	public SquarePegAdapter(SquarePeg squarePeg) {
		this.squarePeg = squarePeg;
	}

	@Override
	public double getRadius() {
		// Calculate a minimum circle radius, which can fit this peg.
		return (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
	}
}
