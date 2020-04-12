package com.example4.youtubecachingproxy;

import lombok.Getter;

@Getter
public class Video {
	private String id;
	private String title;
	private String data;

	public Video(String videoId, String title) {
		this.id = videoId;
		this.title = title;
		this.data = "Random video.";
	}
}
