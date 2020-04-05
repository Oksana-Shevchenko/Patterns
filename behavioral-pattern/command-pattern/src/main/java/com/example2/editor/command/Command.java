package com.example2.editor.command;

import com.example2.editor.Editor;
import lombok.Getter;

@Getter
public abstract class Command {
	private Editor editor;
	private String backup;

	public Command(Editor editor) {
		this.editor = editor;
	}

	public void backup() {
		backup = editor.getTextField().getText();
	}

	public void undo() {
		editor.getTextField().setText(backup);
	}

	public abstract boolean execute();

}
