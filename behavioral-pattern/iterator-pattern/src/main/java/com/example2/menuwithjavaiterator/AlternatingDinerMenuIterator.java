package com.example2.menuwithjavaiterator;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator {
	private MenuItem[] items;
	private int position;

	public AlternatingDinerMenuIterator(MenuItem[] items) {
		this.items = items;
		Calendar rightNow = Calendar.getInstance();
		position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
	}

	@Override
	public boolean hasNext() {
		return !(position >= items.length || items[position] == null);
	}

	@Override
	public Object next() {
		MenuItem item = items[position];
		position = position + 2;
		return item;
	}
}
