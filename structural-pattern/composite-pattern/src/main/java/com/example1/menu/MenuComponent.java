package com.example1.menu;

import java.util.Iterator;

public abstract class MenuComponent {
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	public void print() {
		throw new UnsupportedOperationException();
	}

	public void add(MenuComponent component) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent component) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int position) {
		throw new UnsupportedOperationException();
	}

	public Iterator<MenuComponent> createIterator() {
		throw new UnsupportedOperationException();
	}
}
