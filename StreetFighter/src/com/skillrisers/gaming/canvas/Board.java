package com.skillrisers.gaming.canvas;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.skillrisers.gaming.sprites.OpponentPlayer;
import com.skillrisers.gaming.sprites.Player;

public class Board extends JPanel implements IPlayerConstants{
	BufferedImage imageBg;
	private Player player;
	private OpponentPlayer oppPlayer;
	private Timer timer;
	
	private void gameLoop() {
		timer = new Timer(200, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				repaint();
				
			}
		});
		timer.start();
	}
	
	public Board() throws IOException {
		player = new Player();
		oppPlayer = new OpponentPlayer();
		loadBackground();
		setFocusable(true);
		bindEvents();
		gameLoop();
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
				//System.out.println("Key Typed : " + e.getKeyCode());
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				//System.out.println("Key Released : " + e.getKeyCode());
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println("Key Pressed : " + e.getKeyCode());
				// Bruce Lee Movements
				// Right Move
				if(e.getKeyCode() == KeyEvent.VK_D) {
					player.setSpeed(5);
					player.movePlayer();
					//repaint();
				}
				// Left Move
				else if(e.getKeyCode() == KeyEvent.VK_A) {
					player.setSpeed(-5);
					player.movePlayer();
					//repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					player.setCurrentMove(KICK);
				}
				else if(e.getKeyCode() == KeyEvent.VK_F) {
					player.setCurrentMove(PUNCH);
				}
				
				
				// Ryu Movements
				// Right Move
				if(e.getKeyCode() == RIGHTKEY) {
					oppPlayer.setSpeed(SPEED);
					oppPlayer.movePlayer();
					//repaint();
				}
				// Left Move
				if(e.getKeyCode() == LEFTKEY) {
					oppPlayer.setSpeed(-SPEED);
					oppPlayer.movePlayer();
					//repaint();
				}
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
			imageBg = ImageIO.read(Board.class.getResource(BG_IMG));
		}
		catch(Exception e) {
			System.out.println("Background Failed to Load...");
			System.exit(0);
		}
	}
}
