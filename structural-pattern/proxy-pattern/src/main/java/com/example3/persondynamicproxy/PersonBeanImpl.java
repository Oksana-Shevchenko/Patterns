package com.example3.persondynamicproxy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonBeanImpl implements PersonBean {
	private String name;
	private String gender;
	private String interests;
	private int rating;
	private int ratingCount;

//	@Override
//	public String getName() {
//		return null;
//	}
//
//	@Override
//	public String getGender() {
//		return null;
//	}
//
//	@Override
//	public String getInterests() {
//		return null;
//	}

	@Override
	public int getHotOrNotRating() {
		if (ratingCount == 0) return 0;
		return rating/ratingCount;
	}

//	@Override
//	public void setName(String name) {
//
//	}

//	@Override
//	public void setGender(String gender) {
//
//	}

	@Override
	public void setHotOrNotRating(int rating) {
		this.rating +=rating;
		this.ratingCount++;
	}

//
//	@Override
//	public void setInterests(String interests) {
//
//	}
}
