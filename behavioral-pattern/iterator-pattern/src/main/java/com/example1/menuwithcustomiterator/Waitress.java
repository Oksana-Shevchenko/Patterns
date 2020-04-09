package com.example1.menuwithcustomiterator;

public class Waitress {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu(){
		CustomIterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
		CustomIterator dinerMenuIterator = dinerMenu.createIterator();
		System.out.println("MENU \n --- \n BREAKFAST");
		printMenu(pancakeHouseMenuIterator);
		System.out.println("\n LUNCH");
		printMenu(dinerMenuIterator);
	}

	private void printMenu(CustomIterator iterator) {
		while (iterator.hasNext()) {
			MenuItem item = iterator.next();
			System.out.println(item.getName() + " ");
			System.out.println(item.getDescription() + " ");
			System.out.println(item.getPrice() + " ");
		}
	}

	void printVegetarianMenu(){}
	boolean isItemVegetarian(String name){return false;}
}
