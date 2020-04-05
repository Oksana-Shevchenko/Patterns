package com.example1.remotecontrol.command;

import com.example1.remotecontrol.CeilingFan;

public class CeilingFanHighCommand implements Command {
	private CeilingFan ceilingFan;
	private int previousSpeed;

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		previousSpeed = ceilingFan.getSpeed();
		if (previousSpeed == CeilingFan.OFF) {
			ceilingFan.on();
		}
		ceilingFan.high();
	}

	@Override
	public void undo() {
		if (previousSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (previousSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (previousSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (previousSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}
}
