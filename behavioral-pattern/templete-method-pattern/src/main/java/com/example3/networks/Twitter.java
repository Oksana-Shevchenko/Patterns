package com.example3.networks;

public class Twitter extends Network {

	public Twitter(String userName, String password) {
		setPassword(password);
		setUserName(userName);
	}

	@Override
	boolean logIn(String userName, String password) {
		System.out.println("\n Checking user's parameters");
		System.out.println("Name: " + this.getUserName());
		System.out.print("Password: ");
		for (int i = 0; i < this.getPassword().length(); i++) {
			System.out.print("*");
		}
		System.out.println("\n LogIn success on Twitter");
		return true;
	}

	@Override
	boolean sendDate(byte[] data) {
		System.out.println("Message: '" + new String(data) + "' was posted on Twitter");
		return true;
	}

	@Override
	void logOut() {
		System.out.println("User: '" + getUserName() + "' was logged out from Twitter");
	}
}
