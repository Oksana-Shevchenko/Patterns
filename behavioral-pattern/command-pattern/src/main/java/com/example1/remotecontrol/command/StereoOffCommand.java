package com.example1.remotecontrol.command;

import com.example1.remotecontrol.Stereo;

public class StereoOffCommand implements Command {
	private Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
	}
}
