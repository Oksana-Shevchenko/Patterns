package com.example2.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CompoundShape extends BaseShape {
	private java.util.List<Shape> components = new ArrayList<>();

	public CompoundShape(Shape... components) {
		super(0, 0, Color.BLACK);
		add(components);
	}

	public void add(Shape component) {
		components.add(component);
	}

	public void add(Shape... components) {
		this.components.addAll(Arrays.asList(components));
	}

	public void remove(Shape child) {
		components.remove(child);
	}

	public void remove(Shape... components) {
		this.components.removeAll(Arrays.asList(components));
	}

	public void clear() {
		components.clear();
	}


	@Override
	public int getX() {
		if (components.size() == 0) {
			return 0;
		}
		int x = components.get(0).getX();
		for (Shape shape : components) {
			if (shape.getX() < x) {
				x = shape.getX();
			}
		}
		return x;
	}

	@Override
	public int getY() {
		if (components.size() == 0) {
			return 0;
		}
		int y = components.get(0).getY();
		for (Shape shape : components) {
			if (shape.getY() < y) {
				y = shape.getY();
			}
		}
		return y;
	}

	@Override
	public int getWidth() {
		int maxWidth = 0;
		int x = getX();
		for (Shape shape : components) {
			int shapeRelativeX = shape.getX() - x;
			int shapeWidth = shapeRelativeX + shape.getWidth();
			if (shapeWidth > maxWidth) {
				maxWidth = shapeWidth;
			}
		}
		return maxWidth;
	}

	@Override
	public int getHeight() {
		int maxHeight = 0;
		int y = getY();
		for (Shape shape : components) {
			int shapeRelativeY = shape.getY() - y;
			int shapeHeight = shapeRelativeY + shape.getHeight();
			if (shapeHeight > maxHeight) {
				maxHeight = shapeHeight;
			}
		}
		return maxHeight;
	}

	@Override
	public void move(int x, int y) {
		for (Shape shape : components) {
			shape.move(x, y);
		}
	}

	@Override
	public boolean isInsideBounds(int x, int y) {
		for (Shape shape : components) {
			if (shape.isInsideBounds(x, y)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void unSelect() {
		super.unSelect();
		for (Shape shape : components) {
			shape.unSelect();
		}
	}

	public boolean selectChildAt(int x, int y) {
		for (Shape shape : components) {
			if (shape.isInsideBounds(x, y)) {
				shape.select();
				return true;
			}
		}
		return false;
	}

	@Override
	public void paint(Graphics graphics) {
		if (isSelected()) {
			enableSelectionStyle(graphics);
			graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
			disableSelectionStyle(graphics);
		}

		for (Shape shape : components) {
			shape.paint(graphics);
		}
	}
}
