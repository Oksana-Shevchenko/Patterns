package com.example3.socialprofile;

public interface SocialNetwork {
	ProfileIterator createFriendsIterator(String profileEmail);
	ProfileIterator createCoworkersIterator(String profileEmail);
}
