package com.example2.player;

public class Demo {
	public static void main(String[] args) {
		Player player = new Player();
		UI ui = new UI(player);
		ui.init();
	}
}
