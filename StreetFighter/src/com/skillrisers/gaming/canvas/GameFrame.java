package com.skillrisers.gaming.canvas;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GameFrame extends JFrame implements IPlayerConstants {
	
	public GameFrame() {
		setResizable(false);
		setTitle(GAMETITLE);
		setSize(BOARDWIDTH, BOARDHEIGHT);
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
