package com.example3.socialprofile;

public class SocialSpammer {
	private SocialNetwork socialNetwor;
	private ProfileIterator profileIterator;

	public SocialSpammer(SocialNetwork socialNetwor) {
		this.socialNetwor = socialNetwor;
	}

	public void sendSpamToFriends(String profileEmail, String message) {
		System.out.println("Iterating over friends... \n");
		profileIterator = socialNetwor.createFriendsIterator(profileEmail);
		while (profileIterator.hasNext()) {
			Profile profile = profileIterator.getNext();
			sendMessage(profile.getEmail(), message);
		}
	}

	public void sendSpamToCoworkers(String profileEmail, String message) {
		System.out.println("Iterating over coworkers... \n");
		profileIterator = socialNetwor.createCoworkersIterator(profileEmail);
		while (profileIterator.hasNext()) {
			Profile profile = profileIterator.getNext();
			sendMessage(profile.getEmail(), message);
		}
	}

	private void sendMessage(String email, String message) {
		System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
	}
}

