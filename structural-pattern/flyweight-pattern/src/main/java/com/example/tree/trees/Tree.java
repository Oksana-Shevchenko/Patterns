package com.example.tree.trees;

import lombok.AllArgsConstructor;

import java.awt.*;

@AllArgsConstructor
public class Tree {
	private int x;
	private int y;
	private TreeType type;

	public void draw(Graphics g) {
		type.draw(g, x, y);
	}
}
