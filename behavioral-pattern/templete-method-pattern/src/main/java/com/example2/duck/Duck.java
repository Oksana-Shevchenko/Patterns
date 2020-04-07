package com.example2.duck;

public class Duck implements Comparable {
	private String name;
	private int weigh;

	public Duck(String name, int weigh) {
		this.name = name;
		this.weigh = weigh;
	}

	public String toString() {
		return name + " weighs " + weigh;
	}

	@Override
	public int compareTo(Object object) {
		Duck otherDuck = (Duck) object;
		if (this.weigh < otherDuck.weigh) {
			return -1;
		} else if (this.weigh == otherDuck.weigh) {
			return 0;
		} else {
			return 1;
		}
	}
}
