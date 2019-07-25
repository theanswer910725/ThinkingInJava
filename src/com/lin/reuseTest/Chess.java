package com.lin.reuseTest;

/**
 * @Description 棋
 * @ClassName {@link Chess}
 * @Author Lin.
 * @Date 2019年7月25日 下午10:00:48
 */
public class Chess extends BoardGame {
	Chess() {
		super(11);
		System.out.println("Chess Constructor");
	}
	
	public static void main(String[] args) {
		Chess x = new Chess();
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame Constructor");
	}
}

class Game {
	Game(int i) {
		System.out.println("Game Constructor");
	}
}
