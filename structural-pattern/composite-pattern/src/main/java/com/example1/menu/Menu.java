package com.example1.menu;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
public class Menu extends MenuComponent {
	private String name;
	private String description;
	private List<MenuComponent> menuComponents = new ArrayList<>();
	private Iterator iterator = null;


	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public void print() {
		System.out.print("\n " + getName());

		System.out.println(", " + getDescription());
		System.out.println("---------------");
		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			((MenuComponent) iterator.next()).print();
		}
	}

	@Override
	public void add(MenuComponent component) {
		menuComponents.add(component);
	}

	@Override
	public void remove(MenuComponent component) {
		menuComponents.remove(component);
	}

	@Override
	public MenuComponent getChild(int position) {
		return menuComponents.get(position);
	}

	public Iterator createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(menuComponents.iterator());
		}
		return iterator;
	}
}
