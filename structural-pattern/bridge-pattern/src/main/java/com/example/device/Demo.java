package com.example.device;

import com.example.device.devices.Device;
import com.example.device.devices.Radio;
import com.example.device.devices.Tv;
import com.example.device.remote.AdvancedRemote;
import com.example.device.remote.BasicRemote;

public class Demo {
	public static void main(String[] args) {
		testDevice(new Tv());
		testDevice(new Radio());
	}

	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();

		System.out.println("Tests with advanced remote.");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}
}
