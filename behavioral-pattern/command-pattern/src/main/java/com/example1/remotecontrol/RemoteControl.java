package com.example1.remotecontrol;

import com.example1.remotecontrol.command.Command;

public class RemoteControl {
	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPressed(int slot) {
		if (onCommands[slot] != null) {
			onCommands[slot].execute();
			undoCommand = onCommands[slot];
		}
	}

	public void offButtonWasPressed(int slot) {
		if (onCommands[slot] != null) {
			offCommands[slot].execute();
			undoCommand = offCommands[slot];
		}
	}

	public void undoButtonWasPushed() {
		undoCommand.undo();
	}

	public String toString() {
		StringBuilder stringBuffer = new StringBuilder();
		stringBuffer.append("\n ---Remote Control--- \n");
		for (int i = 0; i < onCommands.length; i++) {
			if (onCommands[i] != null && offCommands[i] != null) {
				stringBuffer.append("[slot ")
						.append(i)
						.append("] ")
						.append(onCommands[i].getClass().getName())
						.append("   ")
						.append(offCommands[i].getClass().getName())
						.append("\n");
			}
		}
		return stringBuffer.toString();
	}
}
