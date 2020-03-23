package com.example1.payment;

import lombok.Data;

@Data
public class Order {
	private int totalCost = 0;
	private boolean isClosed = false;

	public void processOrder(PayStrategy strategy) {
		strategy.pay(getTotalCost());
	}
}
