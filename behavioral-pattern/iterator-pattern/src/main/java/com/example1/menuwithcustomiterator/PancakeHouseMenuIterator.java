package com.example1.menuwithcustomiterator;

import java.util.List;

public class PancakeHouseMenuIterator implements CustomIterator {
	private List<MenuItem> items;
	private int position = 0;

	public PancakeHouseMenuIterator(List<MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		return !(position >= items.size() || items.get(position) == null);
	}

	@Override
	public MenuItem next() {
		MenuItem item = items.get(position);
		position = position + 1;
		return item;
	}
}
