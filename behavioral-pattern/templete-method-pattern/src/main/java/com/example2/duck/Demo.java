package com.example2.duck;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		Duck[] ducks = {
				new Duck("Daffy", 8),
				new Duck("Dewey", 2),
				new Duck("Howard", 7),
				new Duck("Louie", 2),
				new Duck("Donald", 10),
				new Duck("Huey", 2),
		};

		System.out.println("\n Before sorting: ");
		display(ducks);
		Arrays.sort(ducks);
		System.out.println("\n After sorting: ");
		display(ducks);
	}

	private static void display(Duck[] ducks) {
		for (Duck duck : ducks) {
			System.out.println(duck);
		}
	}
}
