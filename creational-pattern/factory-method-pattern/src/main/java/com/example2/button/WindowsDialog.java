package com.example2.button;

public class WindowsDialog extends Dialog {
	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}
