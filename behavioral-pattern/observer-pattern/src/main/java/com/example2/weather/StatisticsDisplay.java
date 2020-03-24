package com.example2.weather;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("Show statistics display");
		System.out.println("Statistics condition: "
				+ temperature + "F degrees and "
				+ humidity + "% humidity and "
				+ pressure + "bar pressure");
	}
}
