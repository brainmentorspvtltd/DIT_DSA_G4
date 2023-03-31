package com.skillrisers.gaming.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class CommonPlayer {
	protected int x;
	protected int y;
	protected int w;
	protected int h;
	protected BufferedImage playerImg;
	
	protected BufferedImage idle() {
		return null;
	}
	
	public void drawPlayer(Graphics pen) {
		pen.drawImage(idle(), x, y, w, h, null);
	}
	
}
