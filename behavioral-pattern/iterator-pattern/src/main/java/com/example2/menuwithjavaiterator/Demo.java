package com.example2.menuwithjavaiterator;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();

		List<Menu> menus = new ArrayList<>();
		menus.add(pancakeHouseMenu);
		menus.add(dinerMenu);
		menus.add(cafeMenu);
		Waitress waitress = new Waitress(menus);
		waitress.printMenu();
	}
}
