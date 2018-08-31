package com.techlabs.tictactoe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.GameStatus;
import com.techlabs.tictactoe.IBoard;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.NineBoard;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.ResultAnalyser;

public class GameTest {

	@Test
	public void shouldSwitchToPlayer1() {

		Player[] player = { new Player("ABC", Mark.O), new Player("XYZ", Mark.X) };
		IBoard board = new NineBoard();
		ResultAnalyser result = new ResultAnalyser(board);
		Game game = new Game(player, board, result);
		assertTrue(player[0].getPlayerMark() == game.getCurrentMark());
	}

	@Test
	public void shouldSwitchToPlayer2() {

		Player[] player = { new Player("ABC", Mark.O), new Player("XYZ", Mark.X) };
		IBoard board = new NineBoard();
		ResultAnalyser result = new ResultAnalyser(board);
		Game game = new Game(player, board, result);
		game.play(0, 0);
		assertTrue(player[1].getPlayerMark() == game.getCurrentMark());
	}

	@Test
	public void shouldNotBoardFull() {

		Player[] player = { new Player("ABC", Mark.O), new Player("XYZ", Mark.X) };
		IBoard board = new NineBoard();
		ResultAnalyser result = new ResultAnalyser(board);
		Game game = new Game(player, board, result);
		assertTrue(false == game.isBoardFull());
	}

	@Test
	public void shouldGamePlay() {
		Player[] player = { new Player("ABC", Mark.O), new Player("XYZ", Mark.X) };
		IBoard board = new NineBoard();
		ResultAnalyser result = new ResultAnalyser(board);

		Game game = new Game(player, board, result);
		assertTrue(GameStatus.PROGRESS == game.play(0, 0));
	}

	@Test
	public void shouldNotGamePlay(){
		Player[] player = { new Player("ABC", Mark.O), new Player("XYZ", Mark.X) };
		IBoard board = new NineBoard();
		ResultAnalyser result = new ResultAnalyser(board);
		Game game = new Game(player, board, result);
		game.play(0, 0);
		assertTrue(GameStatus.NOTEMPTY == game.play(0, 0));
	}
}
