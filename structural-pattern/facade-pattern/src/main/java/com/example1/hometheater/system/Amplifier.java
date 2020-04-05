package com.example1.hometheater.system;

import lombok.Getter;

@Getter
public class Amplifier {
	private Tuner tuner;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;

	public void on() {
		System.out.println("Top-O-Line Amplifier on");
	}

	public void off() {
		System.out.println("Top-O-Line Amplifier off");
	}

	public void setCd(CdPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
		System.out.println("Top-O-Line Amplifier setting CD player to Top-O-Line CD Player");
	}

	public void setDvd(DvdPlayer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
		System.out.println("Top-O-Line Amplifier setting DVD player to Top-O-Line DVD Player");
	}

	public void setStereoSound() {
		System.out.println("Top-O-Line Amplifier stereo sound on (10 speakers, 10 sub-woofer)");
	}

	public void setSurroundSound() {
		System.out.println("Top-O-Line Amplifier surrounding sound on (5 speakers, 1 sub-woofer)");
	}

	public void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}

	public void setVolume(int volume) {
		System.out.println("Top-O-Line Amplifier setting volume to " + volume);
	}

	public String toString() {
		return null;
	}
}
