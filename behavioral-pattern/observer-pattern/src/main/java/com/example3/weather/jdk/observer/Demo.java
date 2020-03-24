package com.example3.weather.jdk.observer;

import java.util.Observable;
import java.util.Observer;

public class Demo {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		Observer currentConditionDisplay = new CurrentConditionDisplay();
		Observer forecastDisplay = new ForecastDisplay();
		Observer statisticsDisplay = new StatisticDisplay();
		weatherData.addObserver(currentConditionDisplay);
		weatherData.addObserver(forecastDisplay);
		weatherData.addObserver(statisticsDisplay);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
