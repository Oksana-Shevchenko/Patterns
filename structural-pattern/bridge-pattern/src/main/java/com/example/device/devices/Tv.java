package com.example.device.devices;

public class Tv implements Device {
	private boolean on = false;
	private int volume = 30;
	private int channel = 1;

	@Override
	public void printStatus() {
		System.out.println("------------------------------------");
		System.out.println("| I'm TV set.");
		System.out.println("| I'm " + (on ? "enabled" : "disabled"));
		System.out.println("| Current volume is " + volume + "%");
		System.out.println("| Current channel is " + channel);
		System.out.println("------------------------------------\n");
	}

	@Override
	public void enable() {
		on = true;
	}

	@Override
	public void disable() {
		on = false;
	}

	@Override
	public boolean isEnabled() {
		return on;
	}

	@Override
	public void setVolume(int percent) {
		if (volume > 100) {
			this.volume = 100;
		} else if (volume < 0) {
			this.volume = 0;
		} else {
			this.volume = percent;
		}
	}

	@Override
	public int getVolume() {
		return this.volume;
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public int getChannel() {
		return this.channel;
	}
}
