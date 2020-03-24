package com.example1.payment;

public class CreditCardPayment implements PayStrategy {
	@Override
	public void pay(int paymentAmount) {
		System.out.println("Paying " + paymentAmount + " using Credit Card.");
	}

}
