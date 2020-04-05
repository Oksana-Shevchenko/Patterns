package com.example1.hometheater;

import com.example1.hometheater.system.*;
import lombok.Getter;

@Getter
public class HomeTheaterFacadeImpl implements HomeTheaterFacade {
	private Amplifier amplifier;
	private Tuner tuner;
	private PopcornPopper popcornPoper;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;
	private Projector projector;
	private TheaterLight theaterLight;
	private Screen screen;

	public HomeTheaterFacadeImpl(Amplifier amplifier,
	                             Tuner tuner,
	                             PopcornPopper popcornPoper,
	                             DvdPlayer dvdPlayer,
	                             CdPlayer cdPlayer,
	                             Projector projector,
	                             TheaterLight theaterLight,
	                             Screen screen) {
		this.amplifier = amplifier;
		this.tuner = tuner;
		this.popcornPoper = popcornPoper;
		this.dvdPlayer = dvdPlayer;
		this.cdPlayer = cdPlayer;
		this.projector = projector;
		this.theaterLight = theaterLight;
		this.screen = screen;
	}

	public void watchMovie(String movie) {
		System.out.println("Get ready to watch movie...");
		popcornPoper.on();
		popcornPoper.pop();
		theaterLight.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amplifier.on();
		amplifier.setDvd(dvdPlayer);
		amplifier.setSurroundSound();
		amplifier.setVolume(5);
		dvdPlayer.on();
		dvdPlayer.play(movie);
	}

	@Override
	public void endMovie(String movie) {
		System.out.println("Shutting movie theater down...");
		popcornPoper.off();
		theaterLight.on();
		screen.up();
		projector.off();
		amplifier.off();
		dvdPlayer.stop(movie);
		dvdPlayer.eject();
		dvdPlayer.off();
	}

	@Override
	public void listenToCD(String cd) {
		System.out.println("Get ready to listen CD...");
		cdPlayer.on();
		cdPlayer.play(cd);

	}

	@Override
	public void endCD(String cd ) {
		cdPlayer.stop(cd);
		cdPlayer.eject();
		cdPlayer.off();
	}

	@Override
	public void listenToRadio() {

	}

	@Override
	public void endRadio() {

	}
}
