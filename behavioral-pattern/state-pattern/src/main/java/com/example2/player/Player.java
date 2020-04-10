package com.example2.player;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Player {
	private State state;
	private boolean playing = false;
	private List<String> playList = new ArrayList<>();
	private int currentTrack = 0;

	public Player() {
		this.state = new ReadyState(this);
		setPlaying(true);
		for (int i = 1; i <= 12; i++) {
			playList.add("Track " + i);
		}
	}

	public void changeState(State state) {
		this.state = state;
	}

	public String startPlayback() {
		return "Playing " + playList.get(currentTrack);
	}

	public void setCurrentTrackAfterStop() {
		this.currentTrack = 0;
	}

	public String nextTrack() {
		currentTrack++;
		if (currentTrack > playList.size() - 1) {
			currentTrack = 0;
		}
		return "Playing " + playList.get(currentTrack);
	}

	public String previousTask() {
		currentTrack--;
		if (currentTrack < 0) {
			currentTrack = playList.size() - 1;
		}
		return "Playing " + playList.get(currentTrack);
	}
}
