package com.example2.button;

public class HtmlButton implements Button {
	@Override
	public void render() {
		System.out.println("<button>Html button</button>");
		onClick();
	}

	@Override
	public void onClick() {
		System.out.println("onClink() - say Hello World!");
	}
}
