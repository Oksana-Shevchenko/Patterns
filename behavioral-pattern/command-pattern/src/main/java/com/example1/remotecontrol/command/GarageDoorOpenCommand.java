package com.example1.remotecontrol.command;

import com.example1.remotecontrol.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	private GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
		garageDoor.lightOn();
	}

	@Override
	public void undo() {
		garageDoor.down();
		garageDoor.lightOff();
	}
}
