package com.example1.gumballmachineremoteproxy;

import lombok.Getter;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@Getter
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
	private String location;
	private State soldOutState;
	private State soldState;
	private State noQuarterState;
	private State hasQuarterState;
	private State winnerState;

	private State state = soldOutState;
	private int count;

	public GumballMachine(String location, int count) throws RemoteException {
		this.soldOutState = new SoldOutState(this);
		this.soldState = new SoldState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.winnerState = new WinnerState(this);

		this.count = count;
		this.location = location;
		if (count > 0) {
			this.state = noQuarterState;
		}
	}

	public GumballMachine(int count) throws RemoteException {
		this.soldOutState = new SoldOutState(this);
		this.soldState = new SoldState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.winnerState = new WinnerState(this);

		this.count = count;
		this.location = location;
		if (count > 0) {
			this.state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Mighty Gumball, Inc \n" +
				"Java-enabled Standing Gumball Model #2004 \n" +
				"Inventory: " + count + " gumballs \n";
	}

}
