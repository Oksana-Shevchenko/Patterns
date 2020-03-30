package com.example2.button;

public class MacOsFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new MacOsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOsCheckbox();
	}
}
