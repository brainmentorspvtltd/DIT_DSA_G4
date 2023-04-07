package com.skillrisers.gaming.sprites;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Power extends CommonPlayer {
	Color color;
	public Power(int x, Color color) {
		this.x = x;
		this.color = color;
		y = 20;
		w = 500;
		h = 50;
	}
	
	public void printHealthBar(Graphics pen) {
		pen.setColor(color);
		pen.fillRect(x, y, w, h);
	}

	@Override
	protected BufferedImage defaultImage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
