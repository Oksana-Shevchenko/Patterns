package com.example1.remotecontrol.command;

import com.example1.remotecontrol.GarageDoor;

public class GarageDoorClosedCommand implements Command {
	private GarageDoor garageDoor;

	public GarageDoorClosedCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.down();
		garageDoor.lightOff();
	}

	@Override
	public void undo() {
		garageDoor.up();
		garageDoor.lightOn();
	}
}
