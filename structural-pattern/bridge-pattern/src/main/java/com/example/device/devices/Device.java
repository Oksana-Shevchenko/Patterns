package com.example.device.devices;

public interface Device {
	void printStatus();

	void enable();

	void disable();

	boolean isEnabled();

	void setVolume(int percent);

	int getVolume();

	void setChannel(int channel);

	int getChannel();
}
