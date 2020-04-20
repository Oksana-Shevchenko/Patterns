package com.example.login;

import com.example.login.middleware.Middleware;
import com.example.login.middleware.RoleCheckMiddleware;
import com.example.login.middleware.ThrottlingMiddleware;
import com.example.login.middleware.UserExistsMiddleware;
import com.example.login.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	private static Server server;

	public static void main(String[] args) {
		boolean success;

		init();

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			do {
				System.out.print("Enter email: ");
				String email = reader.readLine();
				System.out.print("Input password: ");
				String password = reader.readLine();
				success = server.logIn(email, password);
			} while (!success);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void init() {
		server = new Server();
		server.register("admin@example.com", "admin_pass");
		server.register("user@example.com", "user_pass");


		Middleware middleware = new ThrottlingMiddleware(2);
		middleware.linkWith(new UserExistsMiddleware(server)).linkWith(new RoleCheckMiddleware());

		// Server gets a chain from client code.
		server.setMiddleware(middleware);
	}
}
