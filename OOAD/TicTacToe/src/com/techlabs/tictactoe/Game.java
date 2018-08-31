package com.techlabs.tictactoe;

public class Game {
	int count = 1;
	private Player player1, player2;
	private IBoard board;
	private ResultAnalyser resultAnalyser;

	public Game(Player[] player, IBoard board, ResultAnalyser resultAnalyser) {
		this.player1 = player[0];
		this.player2 = player[1];
		this.board = board;
		this.resultAnalyser = resultAnalyser;
	}

	public GameStatus play(int row, int column) {

		try {
			this.board.addMarkInCell(getCurrentMark(), row, column);
			count++;
			return resultAnalyser.checkGameStatus();
		} catch (Exception e) {
			System.out.println(e);
			return GameStatus.PROGRESS;
		}
	}

	public Mark getCurrentMark() {
		if (count % 2 != 0)
			return this.player1.getPlayerMark();
	
			return this.player2.getPlayerMark();
	}

	public IBoard getBoard() {
		return this.board;
	}

	public boolean isBoardFull() {
		return this.board.isBoardFull();
	}
}
