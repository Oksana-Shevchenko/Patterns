package com.example1.payment;

/**
 * Common interface for all strategies.
 */
public interface PayStrategy {
	void pay(int paymentAmount);
}
