package com.techlabs.tictactoe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.Player;

public class PlayerTest {

	@Test
	public void testPlayerName() {

		String name = "Shubham";
		Player player = new Player(name, Mark.O);

		assertTrue(name == player.getPlayerName());
	}

	@Test
	public void testPlayerMark() {

		Player player = new Player("Shubham", Mark.O);
		assertTrue(Mark.O == player.getPlayerMark());
	}

}
