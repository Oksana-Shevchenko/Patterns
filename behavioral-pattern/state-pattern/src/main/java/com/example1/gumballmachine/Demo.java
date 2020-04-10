package com.example1.gumballmachine;

public class Demo {
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
