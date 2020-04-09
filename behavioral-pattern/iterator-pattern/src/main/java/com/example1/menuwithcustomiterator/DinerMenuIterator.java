package com.example1.menuwithcustomiterator;

public class DinerMenuIterator implements CustomIterator {
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
}
