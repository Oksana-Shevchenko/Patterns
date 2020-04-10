package com.example2.player;

public class ReadyState extends State {
	public ReadyState(Player player) {
		super(player);
	}

	@Override
	public String onLock() {
		getPlayer().changeState(new LockedState(getPlayer()));
		return "Locked...";
	}

	@Override
	public String onPlay() {
		String action = getPlayer().startPlayback();
		getPlayer().changeState(new PlayingState(getPlayer()));
		return action;
	}

	@Override
	public String onNext() {
		return "Locked...";
	}

	@Override
	public String onPrevious() {
		return "Locked...";
	}
}
