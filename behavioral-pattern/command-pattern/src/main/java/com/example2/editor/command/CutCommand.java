package com.example2.editor.command;

import com.example2.editor.Editor;

public class CutCommand extends Command {
	public CutCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		if (getEditor().getTextField().getSelectedText().isEmpty())
			return false;

		backup();
		String source = getEditor().getTextField().getText();
		getEditor().setClipboard(getEditor().getTextField().getSelectedText());
		getEditor().getTextField().setText(cutString(source));
		return true;
	}

	private String cutString(String source) {
		String start = source.substring(0, getEditor().getTextField().getSelectionStart());
		String end = source.substring(getEditor().getTextField().getSelectionEnd());
		return start + end;
	}
}
