package com.example2.player;

import lombok.Getter;

@Getter
public abstract class State {
	private Player player;

	public State(Player player) {
		this.player = player;
	}

	public abstract String onLock();
	public abstract String onPlay();
	public abstract String onNext();
	public abstract String onPrevious();
}
