package com.example.car.cars;

import com.example.car.components.Engine;
import com.example.car.components.GPSNavigator;
import com.example.car.components.Transmission;
import com.example.car.components.TripComputer;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Car {
	private final Type type;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;
	@Setter
	private double fuel = 0;

	public Car(Type type, int seats, Engine engine, Transmission transmission,
	           TripComputer tripComputer, GPSNavigator gpsNavigator) {
		this.type = type;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		this.tripComputer.setCar(this);
		this.gpsNavigator = gpsNavigator;
	}
}
