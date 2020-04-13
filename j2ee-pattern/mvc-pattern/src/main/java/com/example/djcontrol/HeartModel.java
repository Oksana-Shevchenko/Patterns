package com.example.djcontrol;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HeartModel implements HeartModelInterface, Runnable {
	private List<BeatObserver> beatObservers = new ArrayList<>();
	private List<BPMObserver> bpmObservers = new ArrayList<>();
	private int bpm = 90;
	private int time = 1000;
	private Random random = new Random(System.currentTimeMillis());
	private Thread thread;

	public HeartModel() {
		thread = new Thread(this);
		thread.start();
	}


	@Override
	public int getHeartRate() {
		return 6000 / time;
	}

	@Override
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		int i = beatObservers.indexOf(o);
		if (i >= 0)
			beatObservers.remove(i);
	}

	@Override
	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}

	@Override
	public void removeObserver(BPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if (i >= 0)
			bpmObservers.remove(i);
	}

	@Override
	public void run() {
		int lastrate = -1;
		for (; ; ) {
			int change = random.nextInt(10);
			if (random.nextInt(2) == 0) {
				change = 0 - change;
			}
			int rate = 6000 / (time + change);
			if (rate < 120 && rate > 50) {
				time += change;
				notifyBeatObservers();
				if (rate != lastrate) {
					lastrate = rate;
					notifyBPMObservers();
				}
			}
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void notifyBPMObservers() {
		bpmObservers.forEach(BPMObserver::updateBPM);
	}

	private void notifyBeatObservers() {
		beatObservers.forEach(BeatObserver::updateBeat);
	}
}
