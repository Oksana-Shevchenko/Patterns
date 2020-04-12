package com.example1.gumballmachineremoteproxy;

import lombok.SneakyThrows;

public class GumballMonitor {
	private GumballMachineRemote gumballMachine;
	public GumballMonitor(GumballMachineRemote gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@SneakyThrows
	public void report(){
		System.out.println("Gumball machine: " + gumballMachine.getLocation());
		System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
		System.out.println("Current state: " + gumballMachine.getState());
	}
}
