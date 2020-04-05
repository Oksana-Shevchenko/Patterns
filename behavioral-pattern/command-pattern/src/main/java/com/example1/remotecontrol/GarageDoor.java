package com.example1.remotecontrol;

public class GarageDoor {
	private String location;

	public GarageDoor(String location) {
		this.location = location;
	}

	public void up() {
		System.out.println(location + " door is open");
	}

	public void down() {
		System.out.println(location + " door is closed");
	}

	public void stop() {
		System.out.println(location + " door is stopped");
	}

	public void lightOn() {
		System.out.println(location + " light is on");
	}

	public void lightOff() {
		System.out.println(location + " light is off in the garage");
	}
}
