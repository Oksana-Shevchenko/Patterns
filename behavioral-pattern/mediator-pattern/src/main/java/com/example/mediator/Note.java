package com.example.mediator;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Note {
	private String name;
	private String text;

	public Note() {
		name = "New note";
	}

	@Override
	public String toString() {
		return name;
	}
}
