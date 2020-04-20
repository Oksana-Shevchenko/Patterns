package com.example.device.remote;

import com.example.device.devices.Device;

public class AdvancedRemote extends BasicRemote {
	public AdvancedRemote(Device device) {
		super(device);
	}

	public void mute() {
		System.out.println("Remote: mute");
		super.getDevice().setVolume(0);
	}
}
