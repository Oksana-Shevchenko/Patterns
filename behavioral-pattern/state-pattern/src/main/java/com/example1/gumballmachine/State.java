package com.example1.gumballmachine;

public interface State {
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
}
