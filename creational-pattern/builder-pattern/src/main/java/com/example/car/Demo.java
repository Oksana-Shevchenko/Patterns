package com.example.car;

import com.example.car.builders.CarBuilder;
import com.example.car.builders.CarManualBuilder;
import com.example.car.cars.Car;
import com.example.car.cars.Manual;
import com.example.car.director.Director;

public class Demo {
	public static void main(String[] args) {
		Director director = new Director();
		CarBuilder builder = new CarBuilder();
		director.constructSportsCar(builder);
		Car car = builder.getResult();
		System.out.println("Car built:\n" + car.getType());

		CarManualBuilder manualBuilder = new CarManualBuilder();
		director.constructSportsCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		System.out.println("\nCar manual built:\n" + carManual.print());
	}
}
