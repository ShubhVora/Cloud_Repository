package com.techlabs.tictactoe;

public interface IBoard {

	public boolean addMarkInCell(Mark mark, int row, int column) throws Exception;

	public int getBoardType();

	public Cell[][] getBoard();

	public boolean isBoardFull();

}
