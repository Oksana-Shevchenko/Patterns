package com.example2.editor;

import com.example2.editor.command.Command;

import java.util.Stack;

public class CommandHistory {
	private Stack<Command> history = new Stack<>();

	public void push(Command c) {
		history.push(c);
	}

	public Command pop() {
		return history.pop();
	}

	public boolean isEmpty() { return history.isEmpty(); }
}
