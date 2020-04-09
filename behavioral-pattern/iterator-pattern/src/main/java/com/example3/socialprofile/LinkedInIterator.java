package com.example3.socialprofile;

import java.util.ArrayList;
import java.util.List;

public class LinkedInIterator implements ProfileIterator {
	private LinkedIn linkedIn;
	private String type;
	private String email;
	private int currentPosition = 0;
	private List<String> emails = new ArrayList<>();
	private List<Profile> contacts = new ArrayList<>();

	public LinkedInIterator(LinkedIn linkedIn, String type, String email) {
		this.linkedIn = linkedIn;
		this.type = type;
		this.email = email;
	}

	@Override
	public boolean hasNext() {
		lazyLoad();
		return currentPosition < emails.size();
	}

	@Override
	public Profile getNext() {
		if (!hasNext()) {
			return null;
		}

		String email = emails.get(currentPosition);
		Profile profile = contacts.get(currentPosition);
		if (profile == null) {
			profile = linkedIn.requestProfileInfoFromLinkedInAPI(email);
			contacts.set(currentPosition, profile);
		}
		currentPosition++;
		return profile;
	}

	@Override
	public void reset() {
		currentPosition = 0;
	}

	private void lazyLoad() {
		if (emails.size() == 0) {
			List<String> profiles = linkedIn.requestRelatedContactsFromLinkedInAPI(this.email, this.type);
			for (String profile : profiles) {
				this.emails.add(profile);
				this.contacts.add(null);
			}
		}
	}
}
