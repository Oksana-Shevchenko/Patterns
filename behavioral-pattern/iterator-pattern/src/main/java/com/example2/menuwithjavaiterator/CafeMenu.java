package com.example2.menuwithjavaiterator;

import lombok.Getter;

import java.util.HashMap;
import java.util.Iterator;

@Getter
public class CafeMenu implements Menu {
	private HashMap<String, MenuItem> menuItems = new HashMap<>();

	public CafeMenu() {
		addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, fries", true, 3.99);
		addItem("Soup of the day", "A cup of soup of the day, with a side salad", false, 3.69);
		addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
	}

	private void addItem(String name, String description, boolean vegeterian, double price) {
		MenuItem item = new MenuItem(name, description, vegeterian, price);
		menuItems.put(item.getName(), item);
	}

	@Override
	public Iterator createIterator() {
		return menuItems.values().iterator();
	}
}
