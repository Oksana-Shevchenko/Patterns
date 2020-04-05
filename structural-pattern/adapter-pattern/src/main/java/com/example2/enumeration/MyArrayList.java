package com.example2.enumeration;

import java.util.ArrayList;
import java.util.Enumeration;

public class MyArrayList<String> extends ArrayList<String> {
	private Enumeration enumerator;

	public MyArrayList() {
		this.enumerator = new IteratorEnumeration(this.iterator());
	}

	public Enumeration enumerator() {
		return new IteratorEnumeration(this.iterator());

	}

	public boolean hasMoreElements() {
		return this.enumerator.hasMoreElements();
	}

	public Object nextElement() {
		return this.enumerator.nextElement();
	}

}
