package com.example2.iconvirtualproxy;

import java.awt.*;
import java.net.URL;

public class ProxyIcon implements Icon {
	private ImageIcon imageIcon;
	private URL imageUrl;
	private Thread retrivalThread;
	private boolean retriving = false;

	public ProxyIcon(URL url) {
		this.imageUrl = url;

	}

	@Override
	public int getIconWidth() {
		if (imageIcon!=null) {
			return imageIcon.getIconWidth();
		}
		return 800;
	}

	@Override
	public int getIconHeight() {
		if (imageIcon!=null) {
			return imageIcon.getIconHeight();
		}
		return 600;
	}

	@Override
	public void paintIcon(Component component, Graphics graphics, int x, int y) {
		if (imageIcon!=null) {
			imageIcon.paintIcon(component, graphics, x, y);
		} else {
			graphics.drawString("Loading CD cover, please wait...", x+300, y+190);
			if (!retriving) {
				retriving = true;
				retrivalThread = new Thread(() -> {
					imageIcon = new ImageIcon(imageUrl, "CD Cover");
					component.repaint();
				});
				retrivalThread.start();
			}
		}
	}
}
