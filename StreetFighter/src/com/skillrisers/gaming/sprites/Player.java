package com.skillrisers.gaming.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.skillrisers.gaming.canvas.IPlayerConstants;

public class Player extends CommonPlayer implements IPlayerConstants {
	
	public Player() throws IOException {
		x = 200;
		h = 250;
		w = 200;
		y = FLOOR - h;
		playerImg = ImageIO.read(Player.class.getResource("bruce_lee.png"));
	}
	
	@Override
	public BufferedImage idle() {
		//X = 21 Y = 15 Width = 60 Height = 94
		return playerImg.getSubimage(21, 15, 60, 94);
	}
	
}
