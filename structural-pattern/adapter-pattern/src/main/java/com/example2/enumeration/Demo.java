package com.example2.enumeration;

import java.util.Enumeration;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<String> lists = new MyArrayList<>();
		lists.add("A");
		lists.add("B");
		lists.add("C");

		for (Enumeration iterator = ((MyArrayList)lists).enumerator(); iterator.hasMoreElements();) {
			String name = (String) iterator.nextElement();
			System.out.println(name);
		}
	}
}
