package com.example3.socialprofile;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator {
	private Facebook facebook;
	private String type;
	private String email;
	private int currentPosition = 0;
	private List<String> emails = new ArrayList<>();
	private List<Profile> contacts = new ArrayList<>();

	public FacebookIterator(Facebook facebook, String type, String email) {
		this.facebook = facebook;
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
			profile = facebook.requestProfileInfoFromFacebookAPI(email);
			contacts.set(currentPosition, profile);
		}
		currentPosition++;
		return profile;	}

	@Override
	public void reset() {
		currentPosition = 0;
	}

	private void lazyLoad() {
		if (emails.size() == 0) {
			List<String> profiles = facebook.requestRelatedContactsFromFacebookAPI(this.email, this.type);
			for (String profile : profiles) {
				this.emails.add(profile);
				this.contacts.add(null);
			}
		}
	}
}
