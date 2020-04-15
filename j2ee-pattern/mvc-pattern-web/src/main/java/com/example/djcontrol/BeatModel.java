package com.example.djcontrol;

public class BeatModel implements BeatModelInterface {
	private int bpm = 90;

	@Override
	public void on() {
		setBPM(90);
	}

	@Override
	public void off() {
		setBPM(0);
	}

	@Override
	public void setBPM(int bpm) {
		this.bpm = bpm;
	}


	@Override
	public int getBPM() {
		return bpm;
	}

}

