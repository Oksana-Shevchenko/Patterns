package com.example2.weather;

public interface Observer {
	void update(float temperature, float humidity, float pressure);
}
