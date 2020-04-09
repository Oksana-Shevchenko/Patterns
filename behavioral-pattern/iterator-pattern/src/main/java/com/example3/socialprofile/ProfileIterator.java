package com.example3.socialprofile;

public interface ProfileIterator {
	boolean hasNext();

	Profile getNext();

	void reset();
}
