package com.skillrisers.gaming.canvas;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Board extends JPanel{
	BufferedImage imageBg;
	public Board() {
		loadBackground();
	}
	@Override
	public void paintComponent(Graphics pen) {
		// Object Render on screen
		showBackground(pen);
	}
	
	private void showBackground(Graphics pen) {
		//image, x, y, width, height
		pen.drawImage(imageBg,0,0,1500,800, null);
	}
	
	private void loadBackground() {
		try {
			imageBg = ImageIO.read(Board.class.getResource("background.png"));
		}
		catch(Exception e) {
			System.out.println("Background Failed to Load...");
			System.exit(0);
		}
	}
}
