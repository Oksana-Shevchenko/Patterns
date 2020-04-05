package com.example1.hometheater.system;

public class DvdPlayer {
	private Amplifier amplifier;

	public void on() {
		System.out.println("Top-O-Line DVD Player on");
	}

	public void off() {
		System.out.println("Top-O-Line DVD Player off");
	}

	public void eject() {
		System.out.println("Top-O-Line DVD Player eject");
	}

	public void pause() {
		System.out.println("Top-O-Line DVD Player pause");
	}

	public void play(String movie) {
		System.out.println("Top-O-Line DVD Player playing: " + movie);
	}

	public void stop(String movie) {
		System.out.println("Top-O-Line DVD Player stopped: " + movie);

	}

	public void setSurroundAudio() {
		System.out.println("Top-O-Line DVD Player set Surround Audio");
	}

	public void setTwoChannelAudio() {
		System.out.println("Top-O-Line DVD Player set Two Channel Audio");
	}
}
