package com.techlabs.tictactoe;

public class NineBoard implements IBoard {

	private Cell[][] cellArray = new Cell[3][3];
	private final int boardType = 3;

	public NineBoard() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				cellArray[i][j] = new Cell();
	}

	public boolean addMarkInCell(Mark mark, int row, int column) throws Exception {
		cellArray[row][column].setMark(mark);
		return true;
	}

	public Cell[][] getBoard() {
		return this.cellArray;
	}

	public int getBoardType() {
		return this.boardType;
	}

	public boolean isBoardFull() {

		Cell[][] cellArray = this.getBoard();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				if (cellArray[i][j].getMark() == Mark.EMPTY) {
					return false;
				}
		}
		return true;
	}

}
