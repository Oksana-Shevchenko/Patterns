package com.example4.youtubecachingproxy;

import java.util.HashMap;


public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
	@Override
	public HashMap<String, Video> popularVideos() {
		connectToServer("http://www.youtube.com/");
		return getRandomVideos();
	}

	private HashMap<String, Video> getRandomVideos() {
		System.out.println("Downloading populars...");
		HashMap<String, Video> hmap = new HashMap<String, Video>();
		hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
		hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
		hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
		hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
		hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

		System.out.print("Done!" + "\n");
		return hmap;
	}

	@Override
	public Video getVideo(String videoId) {
		connectToServer("http://www.youtube.com/"+videoId);
		return getSomeVideo(videoId);
	}

	private void connectToServer(String server) {
		System.out.println("Connecting to " + server + "... ");
		System.out.println("Connected!\n");

	}

	private Video getSomeVideo(String videoId) {
		System.out.println("Downloading video...");
		Video video = new Video(videoId, "Some video title");
		System.out.println("Done!\n");
		return video;
	}


}
