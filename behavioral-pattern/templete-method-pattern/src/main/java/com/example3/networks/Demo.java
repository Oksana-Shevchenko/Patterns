package com.example3.networks;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {
	@SneakyThrows
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Network network = null;
		System.out.print("Input user name: ");
		String userName = reader.readLine();
		System.out.print("Input password: ");
		String password = reader.readLine();

		System.out.print("Input message: ");
		String message = reader.readLine();

		System.out.println("\nChoose social network for posting message.\n" +
				"1 - Facebook\n" +
				"2 - Twitter");
		int choice = Integer.parseInt(reader.readLine());

		// Create proper network object and send the message.
		if (choice == 1) {
			network = new Facebook(userName, password);
		} else if (choice == 2) {
			network = new Twitter(userName, password);
		}
		if (network != null) {
			network.post(message);
		}
	}
}
