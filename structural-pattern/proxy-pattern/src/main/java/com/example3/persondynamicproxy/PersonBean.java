package com.example3.persondynamicproxy;

public interface PersonBean {
	String getName();
	String getGender();
	String getInterests();
	int getHotOrNotRating();
	void setName(String name);
	void setGender(String gender);
	void setHotOrNotRating(int rating);
	void setInterests(String interests);
}
