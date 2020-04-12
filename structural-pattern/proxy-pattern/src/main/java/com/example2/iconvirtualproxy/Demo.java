package com.example2.iconvirtualproxy;

import lombok.SneakyThrows;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Demo {
	private ImageComponent imageComponent;
	private JFrame frame = new JFrame("CD Cover Viewer");
	private JMenuBar menuBar;
	private JMenu menu;
	private HashMap<String, String> cds = new HashMap<>();

	@SneakyThrows
	public Demo() {
		cds.put("Ambient: Music for Airports",
				"http://images.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
		cds.put("Buddha Bar",
				"http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
		cds.put("Ima",
				"http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
		cds.put("Karma",
				"http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
		cds.put("MCMXC A.D.",
				"http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
		cds.put("Northern Exposure",
				"http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
		cds.put("Selected Ambient Works, Vol. 2",
				"http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
		URL initialURL = new URL((String) cds.get("Selected Ambient Works, Vol. 2"));
		menuBar = new JMenuBar();
		menu = new JMenu("Favorite CDs");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);

		for (String key: cds.keySet()) {
			String name = key;
			JMenuItem item = new JMenuItem(name);
			menu.add(item);
			item.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					imageComponent.setIcon(new ProxyIcon(getCDUrl(e.getActionCommand())));
					frame.repaint();
				}

				private URL getCDUrl(String name) {
					try {
						return new URL(cds.get(name));
					} catch (MalformedURLException e) {
						e.printStackTrace();
						return null;
					}
				}
			});
		}
		Icon icon = new ProxyIcon(initialURL);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		Demo demo = new Demo();
	}
}
