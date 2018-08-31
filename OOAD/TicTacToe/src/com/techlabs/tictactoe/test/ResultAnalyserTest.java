package com.techlabs.tictactoe.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.tictactoe.GameStatus;
import com.techlabs.tictactoe.IBoard;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.NineBoard;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.ResultAnalyser;

public class ResultAnalyserTest {

	IBoard board = new NineBoard();
	Player player1 = new Player("ABC", Mark.X);
	Player player2 = new Player("XYZ", Mark.O);
	ResultAnalyser resultAnalyser = new ResultAnalyser(board);

	@Test
	public void shouldWinFirstRow()throws Exception {

		board.addMarkInCell(player1.getPlayerMark(), 0, 0);
		board.addMarkInCell(player2.getPlayerMark(), 1, 0);
		board.addMarkInCell(player1.getPlayerMark(), 0, 1);
		board.addMarkInCell(player2.getPlayerMark(), 2, 0);
		board.addMarkInCell(player1.getPlayerMark(), 0, 2);

		assertTrue(GameStatus.WON_X == resultAnalyser.checkHorizontal());
	}

	@Test
	public void shouldNotWinFirstRow()throws Exception {

		board.addMarkInCell(player1.getPlayerMark(), 0, 0);
		board.addMarkInCell(player2.getPlayerMark(), 1, 0);
		board.addMarkInCell(player1.getPlayerMark(), 0, 1);

		assertTrue(GameStatus.PROGRESS == resultAnalyser.checkHorizontal());
	}

	@Test
	public void shouldWinSecondRow()throws Exception {

		board.addMarkInCell(player1.getPlayerMark(), 1, 0);
		board.addMarkInCell(player2.getPlayerMark(), 0, 0);
		board.addMarkInCell(player1.getPlayerMark(), 1, 1);
		board.addMarkInCell(player2.getPlayerMark(), 2, 0);
		board.addMarkInCell(player1.getPlayerMark(), 1, 2);

		assertTrue(GameStatus.WON_X == resultAnalyser.checkHorizontal());
	}

	@Test
	public void shouldNotWinSecondRow()throws Exception {

		board.addMarkInCell(player1.getPlayerMark(), 1, 0);
		board.addMarkInCell(player2.getPlayerMark(), 0, 0);
		board.addMarkInCell(player1.getPlayerMark(), 1, 1);

		assertTrue(GameStatus.PROGRESS == resultAnalyser.checkHorizontal());
	}

	@Test
	public void shouldWinThirdRow()throws Exception {

		board.addMarkInCell(player1.getPlayerMark(), 2, 0);
		board.addMarkInCell(player2.getPlayerMark(), 1, 0);
		board.addMarkInCell(player1.getPlayerMark(), 2, 1);
		board.addMarkInCell(player2.getPlayerMark(), 1, 1);
		board.addMarkInCell(player1.getPlayerMark(), 2, 2);

		assertTrue(GameStatus.WON_X == resultAnalyser.checkHorizontal());
	}

	@Test
	public void shouldNotWinThirdRow()throws Exception {

		board.addMarkInCell(player1.getPlayerMark(), 2, 0);
		board.addMarkInCell(player2.getPlayerMark(), 1, 0);
		board.addMarkInCell(player1.getPlayerMark(), 2, 1);

		assertTrue(GameStatus.PROGRESS == resultAnalyser.checkHorizontal());
	}

	@Test
	public void shouldWinFirstColumn()throws Exception {

		board.addMarkInCell(player1.getPlayerMark(), 0, 0);
		board.addMarkInCell(player2.getPlayerMark(), 1, 1);
		board.addMarkInCell(player1.getPlayerMark(), 1, 0);
		board.addMarkInCell(player2.getPlayerMark(), 2, 2);
		board.addMarkInCell(player1.getPlayerMark(), 2, 0);

		assertTrue(GameStatus.WON_X == resultAnalyser.checkVertical());
	}

	@Test
	public void shouldNotWinFirstColumn()throws Exception {

		board.addMarkInCell(player1.getPlayerMark(), 0, 0);
		board.addMarkInCell(player2.getPlayerMark(), 1, 1);
		board.addMarkInCell(player1.getPlayerMark(), 1, 0);

		assertTrue(GameStatus.PROGRESS == resultAnalyser.checkVertical());
	}

	@Test
	public void shouldWinSecondColumn()throws Exception {

		board.addMarkInCell(player1.getPlayerMark(), 0, 1);
		board.addMarkInCell(player2.getPlayerMark(), 1, 0);
		board.addMarkInCell(player1.getPlayerMark(), 1, 1);
		board.addMarkInCell(player2.getPlayerMark(), 2, 0);
		board.addMarkInCell(player1.getPlayerMark(), 2, 1);

		assertTrue(GameStatus.WON_X == resultAnalyser.checkVertical());
	}

	@Test
	public void shouldNotWinSecondColumn()throws Exception {

		board.addMarkInCell(player1.getPlayerMark(), 0, 1);
		board.addMarkInCell(player2.getPlayerMark(), 1, 0);
		board.addMarkInCell(player1.getPlayerMark(), 1, 1);

		assertTrue(GameStatus.PROGRESS == resultAnalyser.checkVertical());
	}

	@Test
	public void shouldWinThirdColumn()throws Exception {

		board.addMarkInCell(player1.getPlayerMark(), 0, 2);
		board.addMarkInCell(player2.getPlayerMark(), 1, 0);
		board.addMarkInCell(player1.getPlayerMark(), 1, 2);
		board.addMarkInCell(player2.getPlayerMark(), 2, 0);
		board.addMarkInCell(player1.getPlayerMark(), 2, 2);

		assertTrue(GameStatus.WON_X == resultAnalyser.checkVertical());
	}

	@Test
	public void shouldNotWinThirdColumn()throws Exception {

		board.addMarkInCell(player1.getPlayerMark(), 0, 2);
		board.addMarkInCell(player2.getPlayerMark(), 1, 0);
		board.addMarkInCell(player1.getPlayerMark(), 1, 2);

		assertTrue(GameStatus.PROGRESS == resultAnalyser.checkVertical());
	}

	@Test
	public void shouldIncreaseDiagonalTest()throws Exception {

		board.addMarkInCell(player1.getPlayerMark(), 0, 0);
		board.addMarkInCell(player2.getPlayerMark(), 1, 0);
		board.addMarkInCell(player1.getPlayerMark(), 1, 1);
		board.addMarkInCell(player2.getPlayerMark(), 2, 0);
		board.addMarkInCell(player1.getPlayerMark(), 2, 2);

		assertTrue(GameStatus.WON_X == resultAnalyser.checkDiagonal());
	}

	@Test
	public void shouldDecreaseDiagonalTest()throws Exception {

		board.addMarkInCell(player1.getPlayerMark(), 0, 2);
		board.addMarkInCell(player2.getPlayerMark(), 1, 0);
		board.addMarkInCell(player1.getPlayerMark(), 1, 1);
		board.addMarkInCell(player2.getPlayerMark(), 2, 1);
		board.addMarkInCell(player1.getPlayerMark(), 2, 0);

		assertTrue(GameStatus.WON_X == resultAnalyser.checkDiagonal());
	}

	@Test
	public void shouldUnequalDiagonalTest()throws Exception {

		board.addMarkInCell(player1.getPlayerMark(), 0, 0);
		board.addMarkInCell(player2.getPlayerMark(), 1, 1);
		board.addMarkInCell(player1.getPlayerMark(), 2, 2);
		board.addMarkInCell(player2.getPlayerMark(), 0, 2);
		board.addMarkInCell(player1.getPlayerMark(), 2, 0);

		assertTrue(GameStatus.PROGRESS == resultAnalyser.checkDiagonal());
	}

}
