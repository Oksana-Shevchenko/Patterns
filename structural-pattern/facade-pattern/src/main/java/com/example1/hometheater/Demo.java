package com.example1.hometheater;

import com.example1.hometheater.system.*;

public class Demo {
	public static void main(String[] args) {
		Amplifier amplifier = new Amplifier();
		Tuner tuner = new Tuner();
		PopcornPopper popcornPoper = new PopcornPopper();
		DvdPlayer dvdPlayer = new DvdPlayer();
		CdPlayer cdPlayer = new CdPlayer();
		Projector projector = new Projector();
		TheaterLight theaterLight = new TheaterLight();
		Screen screen = new Screen();

		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacadeImpl(amplifier,
				tuner,
				popcornPoper,
				dvdPlayer,
				cdPlayer,
				projector,
				theaterLight,
				screen);
		homeTheaterFacade.watchMovie("Riders of the Lost Ark");
		homeTheaterFacade.endMovie("Riders of the Lost Ark");
	}
}
