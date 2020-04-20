package com.example.car.builders;

import com.example.car.cars.Manual;
import com.example.car.cars.Type;
import com.example.car.components.Engine;
import com.example.car.components.GPSNavigator;
import com.example.car.components.Transmission;
import com.example.car.components.TripComputer;
import lombok.Setter;

@Setter
public class CarManualBuilder implements Builder {
	private Type type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	public Manual getResult() {
		return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}
}
