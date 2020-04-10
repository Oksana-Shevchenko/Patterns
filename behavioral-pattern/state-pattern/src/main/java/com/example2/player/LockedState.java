package com.example2.player;

public class LockedState extends State {
	public LockedState(Player player) {
		super(player);
		player.setPlaying(false);
	}

	@Override
	public String onLock() {
		if (getPlayer().isPlaying()) {
			getPlayer().changeState(new ReadyState(getPlayer()));
			return "Stop playing";
		} else {
			return "Locked...";
		}
	}

	@Override
	public String onPlay() {
		getPlayer().changeState(new ReadyState(getPlayer()));
		return "Ready";
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
