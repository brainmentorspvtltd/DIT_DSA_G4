package com.skillrisers.gaming.sprites;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.skillrisers.gaming.canvas.IPlayerConstants;

public class OpponentPlayer extends CommonPlayer implements IPlayerConstants {
	public OpponentPlayer() throws IOException {
		x = BOARDWIDTH - 500;
		h = 250;
		w = 200;
		y = FLOOR - h;
		playerImg = ImageIO.read(Player.class.getResource("ryu_.png"));
	}
	
	@Override
	public BufferedImage idle() {
		//X = 2557 Y = 31 Width = 101 Height = 235
		return playerImg.getSubimage(2557, 31, 101, 235);
	}
}
