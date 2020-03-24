package com.example2.weather;

public class Demo {
	public static void main(String[] args) {
		Subject subject = new WeatherData();
		Observer currentConditionDisplay = new CurrentConditionDisplay();
		Observer forecastDisplay = new ForecastDisplay();
		Observer statisticsDisplay = new StatisticsDisplay();
		subject.registerObserver(currentConditionDisplay);
		subject.registerObserver(forecastDisplay);
		subject.registerObserver(statisticsDisplay);

		((WeatherData) subject).setMeasurements(80, 65, 30.4f);
		((WeatherData) subject).setMeasurements(82, 70, 29.2f);
		((WeatherData) subject).setMeasurements(78, 90, 29.2f);
	}
}
