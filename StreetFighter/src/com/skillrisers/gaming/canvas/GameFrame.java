package com.skillrisers.gaming.canvas;

import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GameFrame extends JFrame implements IPlayerConstants {
	
	public GameFrame() throws IOException {
		setResizable(false);
		setTitle(GAMETITLE);
		setSize(BOARDWIDTH, BOARDHEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		JButton btn = new JButton("New Button...");
//		btn.setBounds(100,100,200,100);
		Board board = new Board();
		add(board);
		setVisible(true);
	}

//	public static void main(String[] args) {
//		try {
//			GameFrame obj = new GameFrame();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
