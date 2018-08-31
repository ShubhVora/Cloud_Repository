package com.techlabs.tictactoe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.tictactoe.Cell;
import com.techlabs.tictactoe.Mark;

public class CellTest {

	@Test
	public void shouldGetMark() {
		Cell cell = new Cell();
		assertTrue(Mark.EMPTY == cell.getMark());

	}

	@Test
	public void shouldCheckCellEmpty() {
		Cell cell = new Cell();
		assertTrue(true == cell.checkCellEmpty());

	}

	@Test
	public void shouldMarkFirstTime() throws Exception {
		Cell cell = new Cell();
		cell.setMark(Mark.X);
		assertTrue(Mark.X == cell.getMark());

	}

	public void shouldNotMarkSecondTime() throws Exception {
		Cell cell = new Cell();
		cell.setMark(Mark.X);
		cell.setMark(Mark.O);

	}

}
