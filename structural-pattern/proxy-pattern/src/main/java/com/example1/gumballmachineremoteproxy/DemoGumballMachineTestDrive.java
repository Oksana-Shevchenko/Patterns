package com.example1.gumballmachineremoteproxy;

import lombok.SneakyThrows;

import java.rmi.Naming;

public class DemoGumballMachineTestDrive {
	@SneakyThrows
	public static void main(String[] args) {
		int count = 0;

		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		count = Integer.parseInt(args[1]);
		GumballMachine gumballMachine = new GumballMachine(args[0], count);
		Naming.rebind("//"+args[0] + "/gumballmachineremoteproxy", gumballMachine);
		GumballMonitor monitor = new GumballMonitor(gumballMachine);
		monitor.report();
	}
}
