package com.example1.gumballmachineremoteproxy;

import lombok.SneakyThrows;

public class Demo {
	@SneakyThrows
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
