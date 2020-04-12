package com.example2.iconvirtualproxy;

import lombok.Setter;

import javax.swing.*;
import java.awt.*;

@Setter
public class ImageComponent extends JComponent {
	private Icon icon;

	public ImageComponent(Icon icon) {
		this.icon = icon;
	}

	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		int width = icon.getIconWidth();
		int height = icon.getIconHeight();
		int x = (800 - width) / 2;
		int y = (600 - height) / 2;
		icon.paintIcon(this, graphics, x, y);
	}
}
