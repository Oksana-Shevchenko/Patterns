package com.example3.socialprofile;

import java.util.ArrayList;
import java.util.List;

public class LinkedIn implements SocialNetwork {
	private List<Profile> contacts = new ArrayList<>();

	public LinkedIn(List<Profile> contacts) {
		if (contacts != null) {
			this.contacts = contacts;
		}
	}

	@Override
	public ProfileIterator createFriendsIterator(String email) {
		return new LinkedInIterator(this, "friends", email);
	}

	@Override
	public ProfileIterator createCoworkersIterator(String email) {
		return new LinkedInIterator(this, "coworkers", email);
	}

	public Profile requestProfileInfoFromLinkedInAPI(String email) {
		simulateNetworkLatency();

		System.out.println("LinkedIn: Loading profile '" + email + "' over the network...");
		return findContact(email);
	}

	public List<String> requestRelatedContactsFromLinkedInAPI(String email, String type) {
		simulateNetworkLatency();
		System.out.println("LinkedIn: Loading '" + type + "' list of '" + email + "' over the network...");
		Profile profile = findContact(email);
		if (profile != null) {
			return profile.getContacts(type);
		}
		return null;
	}

	private Profile findContact(String email) {
		for (Profile profile : contacts) {
			if (profile.getEmail().equals(email)) {
				return profile;
			}
		}
		return null;
	}

	private void simulateNetworkLatency() {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
