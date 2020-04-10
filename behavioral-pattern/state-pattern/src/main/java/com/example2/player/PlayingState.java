package com.example2.player;

public class PlayingState extends State {
	public PlayingState(Player player) {
		super(player);
	}

	@Override
	public String onLock() {
		getPlayer().changeState(new LockedState(getPlayer()));
		getPlayer().setCurrentTrackAfterStop();
		return "Stop playing";
	}

	@Override
	public String onPlay() {
		getPlayer().changeState(new ReadyState(getPlayer()));
		return "Paused...";
	}

	@Override
	public String onNext() {
		return getPlayer().nextTrack();
	}

	@Override
	public String onPrevious() {
		return getPlayer().previousTask();
	}
}
