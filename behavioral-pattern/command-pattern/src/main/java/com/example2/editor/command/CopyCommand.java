package com.example2.editor.command;

import com.example2.editor.Editor;

public class CopyCommand extends Command {
	public CopyCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		Editor editor = getEditor();
		String text = getEditor().getTextField().getSelectedText();
		editor.setClipboard(text);
		return false;
	}
}
