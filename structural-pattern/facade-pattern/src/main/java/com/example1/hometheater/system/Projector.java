package com.example1.hometheater.system;

public class Projector {
	private DvdPlayer dvdPlayer;

	public void on() {
		System.out.println("Top-O-Line Projector on");
	}

	public void off() {
		System.out.println("Top-O-Line Projector off");
	}

	public void tvMode() {
		System.out.println("Top-O-Line Projector in tv mode (9x9 aspect ratio)");
	}

	public void wideScreenMode() {
		System.out.println("Top-O-Line Projector in wide-screen mode (16x9 aspect ratio)");
	}
}
