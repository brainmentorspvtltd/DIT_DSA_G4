package com.skillrisers.gaming.canvas;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.skillrisers.gaming.sprites.OpponentPlayer;
import com.skillrisers.gaming.sprites.Player;

public class Board extends JPanel{
	BufferedImage imageBg;
	private Player player;
	private OpponentPlayer oppPlayer;
	public Board() throws IOException {
		player = new Player();
		oppPlayer = new OpponentPlayer();
		loadBackground();
		setFocusable(true);
		bindEvents();
	}
	@Override
	public void paintComponent(Graphics pen) {
		// Object Render on screen
		showBackground(pen);
		player.drawPlayer(pen);
		oppPlayer.drawPlayer(pen);
	}
	
	private void bindEvents() {
		KeyListener listener = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("Key Typed : " + e.getKeyCode());
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Key Released : " + e.getKeyCode());
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("Key Pressed : " + e.getKeyCode());
			}
		};
		this.addKeyListener(listener);
	}
	
	
	private void showBackground(Graphics pen) {
		//image, x, y, width, height
		pen.drawImage(imageBg,0,0,1500,800, null);
	}
	
	private void loadBackground() {
		try {
			imageBg = ImageIO.read(Board.class.getResource("bg_2.jpg"));
		}
		catch(Exception e) {
			System.out.println("Background Failed to Load...");
			System.exit(0);
		}
	}
}
