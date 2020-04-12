package com.example1.gumballmachineremoteproxy;

import lombok.SneakyThrows;

import java.rmi.Naming;

public class DemoGumballMonitorTestDrive {
	@SneakyThrows
	public static void main(String[] args) {
		String[] location = {"rmi://santafe.mightygumball.com/gumballmachineremoteproxy",
				"rmi://boulder.mightygumball.com/gumballmachineremoteproxy",
				"rmi://seattle.mightygumball.com/gumballmachineremoteproxy"};
		GumballMonitor[] monitors = new GumballMonitor[location.length];
		for (int i = 0; i < location.length; i++) {
			GumballMachineRemote machineRemote = (GumballMachineRemote) Naming.lookup(location[i]);
			monitors[i] = new GumballMonitor(machineRemote);
			System.out.println(monitors[i]);
		}
		for (int i = 0; i < monitors.length; i++) {
			monitors[i].report();
		}
	}
}
