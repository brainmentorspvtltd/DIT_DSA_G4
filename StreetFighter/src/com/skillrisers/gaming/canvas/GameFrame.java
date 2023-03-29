package com.skillrisers.gaming.canvas;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	public GameFrame() {
		setResizable(false);
		setTitle("Street Fighter Game By Brain Mentors");
		setSize(1500, 800);
		setLocationRelativeTo(null);
//		JButton btn = new JButton("New Button...");
//		btn.setBounds(100,100,200,100);
		Board board = new Board();
		add(board);
		setVisible(true);
	}

	public static void main(String[] args) {
		GameFrame obj = new GameFrame();
	}

}
