package com.techlabs.tictactoe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.tictactoe.IBoard;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.NineBoard;

public class NineBoardTest {

	IBoard board = new NineBoard();

	@Test
	public void shouldMarkCell() throws Exception {
		assertTrue(true == board.addMarkInCell(Mark.O, 0, 0));
	}

	@Test
	public void shouldNotMarkCell() throws Exception {
		IBoard board = new NineBoard();
		board.addMarkInCell(Mark.O, 0, 0);
		assertTrue(false == board.addMarkInCell(Mark.O, 0, 0));
	}

	@Test
	public void shouldBoardFull() throws Exception {
		IBoard board = new NineBoard();
		board.addMarkInCell(Mark.O, 0, 0);
		board.addMarkInCell(Mark.X, 0, 1);
		board.addMarkInCell(Mark.O, 0, 2);
		board.addMarkInCell(Mark.O, 1, 0);
		board.addMarkInCell(Mark.X, 1, 1);
		board.addMarkInCell(Mark.X, 1, 2);
		board.addMarkInCell(Mark.X, 2, 0);
		board.addMarkInCell(Mark.O, 2, 1);
		board.addMarkInCell(Mark.O, 2, 2);
		assertTrue(true == board.isBoardFull());
	}

	@Test
	public void shouldNotBoardFull() throws Exception {
		IBoard board = new NineBoard();
		assertTrue(false == board.isBoardFull());
	}

	@Test
	public void shouldReturnBoardType() throws Exception {
		IBoard board = new NineBoard();
		assertTrue(3 == board.getBoardType());
	}

}
