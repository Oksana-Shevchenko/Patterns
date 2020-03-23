package com.example2.duck;

public class MuteQuack implements QuackBehaviour {
	@Override
	public void quack() {
		System.out.println("MuteQuack");
	}
}
