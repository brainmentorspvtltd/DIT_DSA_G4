package com.skillrisers.gaming.canvas;

import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import jaco.mp3.player.MP3Player;

public class SplashScreen extends JFrame implements IPlayerConstants {
	
	private JLabel label = new JLabel();
	private MP3Player mp3Player;
	
	public SplashScreen() {
		setResizable(false);
		setTitle(GAMETITLE);
		setSize(BOARDWIDTH, BOARDHEIGHT);
		setLocationRelativeTo(null);
		
		Icon icon = new ImageIcon(SplashScreen.class.getResource("splash.jpg"));
		label.setIcon(icon);
		this.add(label);
		loadMusic();
		setVisible(true);
		
		try {
			Thread.sleep(10000);
			setVisible(false);
			dispose();
			mp3Player.stop();
			GameFrame obj = new GameFrame();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void loadMusic() {
		mp3Player = new MP3Player(SplashScreen.class.getResource("theme.mp3"));
		mp3Player.play();
	}

	public static void main(String[] args) {
		
		SplashScreen obj = new SplashScreen();

	}

}
