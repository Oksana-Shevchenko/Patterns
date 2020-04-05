package com.example2.editor.command;

import com.example2.editor.Editor;

public class PasteCommand extends Command {
	public PasteCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		if (getEditor().getClipboard() == null || getEditor().getClipboard().isEmpty())
			return false;

		backup();
		getEditor().getTextField().insert(getEditor().getClipboard(), getEditor().getTextField().getCaretPosition());
		return true;
	}
}
