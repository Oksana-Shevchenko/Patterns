package com.example2.iconvirtualproxy;

import java.awt.*;
import java.net.URL;

public class ImageIcon implements Icon {
	private URL url;
	private String name;

	public ImageIcon(URL imageURL, String cd_cover) {
		this.url = imageURL;
		this.name = cd_cover;
	}

	@Override
	public int getIconWidth() {
		return 800;
	}

	@Override
	public int getIconHeight() {
		return 600;
	}

	@Override
	public void paintIcon(Component component, Graphics graphics, int x, int y) {
		component.repaint();
	}
}
