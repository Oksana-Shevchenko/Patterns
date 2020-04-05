package com.example1.hometheater.system;

public class CdPlayer {
	private Amplifier amplifier;

	public void on() {
		System.out.println("Top-O-Line CD Player on");
	}

	public void off() {
		System.out.println("Top-O-Line CD Player off");
	}

	public void eject() {
		System.out.println("Top-O-Line CD Player eject");
	}

	public void pause() {
		System.out.println("Top-O-Line CD Player pause");
	}

	public void play(String cd) {
		System.out.println("Top-O-Line CD Player play: " + cd);
	}

	public void stop(String cd) {
		System.out.println("Top-O-Line CD Player stop: " + cd);
	}
}
