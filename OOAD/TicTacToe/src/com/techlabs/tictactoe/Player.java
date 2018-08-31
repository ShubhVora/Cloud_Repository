package com.techlabs.tictactoe;

public class Player {
	String name;
	Mark mark;

	public Player(String name, Mark mark) {
		this.name = name;
		this.mark = mark;
	}

	public String getPlayerName() {
		return this.name;
	}

	public Mark getPlayerMark() {
		return this.mark;
	}

}
