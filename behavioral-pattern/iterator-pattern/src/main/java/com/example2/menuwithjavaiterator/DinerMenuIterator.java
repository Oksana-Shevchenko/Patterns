package com.example2.menuwithjavaiterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
	private MenuItem[] items;
	private int position;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		return !(position >= items.length || items[position] == null);
	}

	@Override
	public MenuItem next() {
		MenuItem item = items[position];
		position = position + 1;
		return item;
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException("You can't remove an item until you are done at least one next()");
		}
		if (items[position - 1] != null) {
			for (int i = position - 1; i < (items.length - 1); i++) {
				items[i] = items[i + 1];
			}
			items[items.length - 1] = null;
		}
	}
}
