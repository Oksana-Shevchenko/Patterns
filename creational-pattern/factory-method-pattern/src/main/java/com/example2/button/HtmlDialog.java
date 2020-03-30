package com.example2.button;

public class HtmlDialog extends Dialog {
	@Override
	public Button createButton() {
		return new HtmlButton();
	}
}
