package com.example4.youtubecachingproxy;

import java.util.HashMap;

public class YoutubeDownloader {
	private ThirdPartyYoutubeLib api;

	public YoutubeDownloader(ThirdPartyYoutubeLib api) {
		this.api = api;
	}

	public void renderPopularVideos() {
		HashMap<String, Video> list = api.popularVideos();
		System.out.println("\n-------------------------------");
		System.out.println("Most popular videos on Youtube (imagine fancy HTML)");
		for (Video video : list.values()) {
			System.out.println("ID: " + video.getId() + " / Title: " + video.getTitle());
		}
		System.out.println("-------------------------------\n");
	}

	public void renderVideoPage(String videoId) {
		Video video = api.getVideo(videoId);
		System.out.println("\n-------------------------------");
		System.out.println("Video page (imagine fancy HTML)");
		System.out.println("ID: " + video.getId());
		System.out.println("Title: " + video.getTitle());
		System.out.println("Video: " + video.getData());
		System.out.println("-------------------------------\n");
	}
}
