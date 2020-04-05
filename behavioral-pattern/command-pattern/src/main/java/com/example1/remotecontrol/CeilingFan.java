package com.example1.remotecontrol;

import lombok.Getter;

@Getter
public class CeilingFan {
	private String location;
	private int speed;
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	public CeilingFan(String location) {
		this.location = location;
		this.speed = OFF;
	}

	public void on() {
		speed = LOW;
		System.out.println(location + " Ceiling fan is on");
	}

	public void off() {
		speed = OFF;
		System.out.println(location + " Ceiling fan is off");
	}

	public void high() {
		speed =  HIGH;
	}

	public void medium(){
		speed = MEDIUM;
	}

	public void low() {
		speed = LOW;
	}
}
