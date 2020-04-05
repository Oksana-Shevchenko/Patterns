package com.example1.duck;

public class Demo {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		Turkey duckAdapter = new DuckAdapter(duck);

		System.out.println("The Turkey says...");
		testTurkey(turkey);

		System.out.println("\n The Duck says...");
		testDuck(duck);

		System.out.println("\n The Turkey adapter says...");
		testDuck(turkeyAdapter);

		System.out.println("\n The Duck adapter days...");
		testTurkey(duckAdapter);
	}

	private static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}

	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
