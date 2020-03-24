package com.example2.weather;

public class ForecastDisplay implements Observer, DisplayElement {
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
		System.out.println("Show forecast display");
		System.out.println("Forecast condition: "
				+ temperature + "F degrees and "
				+ humidity + "% humidity and "
				+ pressure + "bar pressure");
	}
}
