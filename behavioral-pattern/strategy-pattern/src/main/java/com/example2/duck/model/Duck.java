package com.example2.duck.model;

import com.example2.duck.FlyBehaviour;
import com.example2.duck.QuackBehaviour;
import lombok.Setter;

@Setter
public class Duck {
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;

	public void swim() {
		System.out.println("Duck swimming");
	}

	public void display() {
		System.out.println("Duck displaying");
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void performFly() {
		flyBehaviour.fly();
	}
}
