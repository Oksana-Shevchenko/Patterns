package com.example.login.middleware;

public abstract class Middleware {
	private Middleware next;

	public Middleware linkWith(Middleware next) {
		this.next = next;
		return next;
	}

	public boolean checkNext(String email, String password) {
		if (next == null) {
			return true;
		}
		return next.check(email, password);
	}

	public abstract boolean check(String email, String password);

}
