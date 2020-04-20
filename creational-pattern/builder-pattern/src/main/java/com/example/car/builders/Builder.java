package com.example.car.builders;

import com.example.car.cars.Type;
import com.example.car.components.Engine;
import com.example.car.components.GPSNavigator;
import com.example.car.components.Transmission;
import com.example.car.components.TripComputer;

public interface Builder {
	void setType(Type type);

	void setSeats(int seats);

	void setEngine(Engine engine);

	void setTransmission(Transmission transmission);

	void setTripComputer(TripComputer tripComputer);

	void setGPSNavigator(GPSNavigator gpsNavigator);
}
