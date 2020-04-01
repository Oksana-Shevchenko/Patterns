package com.example1.chocolate;

import lombok.Getter;

@Getter
public class ChocolateBoiler {
	private static volatile ChocolateBoiler instance;
	private boolean empty;
	private boolean boiled;
	private String value;

	private ChocolateBoiler(String value) {
		empty = true;
		boiled = false;
		this.value = value;
	}

	public static ChocolateBoiler getInstance(String value) {
		if (instance == null) {
			synchronized (ChocolateBoiler.class) {
				if (instance == null) {
					instance = new ChocolateBoiler(value);
				}
			}
		}
		return instance;
	}

	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
		}
	}

	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
		}
	}

	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
}
