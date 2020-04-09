package com.example1.menu;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	private Stack<Iterator<MenuComponent>> stack = new Stack<>();

	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (iterator.hasNext()) {
				return true;
			} else {
				stack.pop();
				return hasNext();
			}
		}
	}

	@Override
	public Object next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			if (component instanceof Menu) {
				stack.push(component.createIterator());
			}
			return component;
		} else {
			return null;
		}
	}
}
