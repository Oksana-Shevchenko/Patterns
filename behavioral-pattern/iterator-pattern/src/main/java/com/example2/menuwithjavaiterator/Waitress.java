package com.example2.menuwithjavaiterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {
	private List<Menu> menus;

	public Waitress(List<Menu> menus) {
		this.menus = menus;
	}

	public void printMenu() {
		Iterator  menuIterator = menus.iterator();
		while (menuIterator.hasNext()) {
			Menu menu = (Menu) menuIterator.next();
			printMenu(menu.createIterator());
		}
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem item = (MenuItem) iterator.next();
			System.out.println(item.getName() + " ");
			System.out.println(item.getDescription() + " ");
			System.out.println(item.getPrice() + " ");
		}
	}
}
