package com.skillrisers.gaming.canvas;

public interface IPlayerConstants {
	int BOARDWIDTH = 1500;
	int BOARDHEIGHT = 800;
	String GAMETITLE = "Street Fighter Game By Brain Mentors";
	int FLOOR = BOARDHEIGHT - 200;
	int LEFTKEY = 37;
	int RIGHTKEY = 39;
	int KEY_D = 68;
	int KEY_A = 65;
	int SPEED = 10;
	int MAX_HEALTH = 500;
	String BG_IMG = "bg_2.jpg";
	String PLAYER_IMG = "bruce_lee.png";
	String OPPONENT_PLAYER_IMG = "ryu_.png";
	int IDLE = 1;
	int WALK = 2;
	int KICK = 3;
	int PUNCH = 4;
	int HIT = 5;
	float GRAVITY = 9.8f;
}
