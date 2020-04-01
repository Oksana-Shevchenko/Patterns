package com.example1.chocolate;

public class Demo {
	public static void main(String[] args) {
		System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
				"If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
				"RESULT:" + "\n");
		Thread threadFoo = new Thread(new ThreadChocolateBoiler1());
		Thread threadBar = new Thread(new ThreadChocolateBoiler2());
		threadFoo.start();
		threadBar.start();
	}
	static class ThreadChocolateBoiler1 implements Runnable {
		@Override
		public void run() {
			ChocolateBoiler singleton = ChocolateBoiler.getInstance("FOO");
			System.out.println(singleton.getValue());
		}
	}

	static class ThreadChocolateBoiler2 implements Runnable {
		@Override
		public void run() {
			ChocolateBoiler singleton = ChocolateBoiler.getInstance("BAR");
			System.out.println(singleton.getValue());
		}
	}
}
