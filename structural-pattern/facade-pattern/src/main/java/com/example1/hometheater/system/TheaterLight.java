package com.example1.hometheater.system;

public class TheaterLight {
	public void on() {
		System.out.println("Theater Ceiling Lights on");
	}

	public void off() {
		System.out.println("Theater Ceiling Lights off");
	}

	public void dim(int value) {
		System.out.println("Theater Ceiling Lights dimming to " + value + "%");
	}
}
