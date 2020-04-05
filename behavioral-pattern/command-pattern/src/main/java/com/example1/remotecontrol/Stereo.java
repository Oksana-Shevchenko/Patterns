package com.example1.remotecontrol;

public class Stereo {
	private String location;

	public Stereo(String location){
		this.location = location;
	}

	public void on() {
		System.out.println(location + " Stereo is on");
	}

	public void off() {
		System.out.println(location + " Stereo is off");
	}

	public void setCd() {
		System.out.println(location + " Stereo is set to CD");
	}

	public void setDvd() {
		System.out.println(location + " Stereo is set to DVD");
	}

	public void setRadio() {
		System.out.println(location + " Stereo is set to Radio");
	}

	public void setVolume(int volume) {
		System.out.println(location + " Stereo volume set to " + volume);
	}
}
