package com.example3.networks;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Network {
	private String password;
	private String userName;

	public Network() {
	}

	public boolean post(String message) {
		if (logIn(this.userName, this.password)) {
			boolean result = sendDate(message.getBytes());
			logOut();
			return result;
		}
		return false;
	}

	abstract boolean logIn(String userName, String password);

	abstract boolean sendDate(byte[] data);

	abstract void logOut();
}
