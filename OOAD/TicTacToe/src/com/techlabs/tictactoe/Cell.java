package com.techlabs.tictactoe;

public class Cell {

	Mark mark;

	public Cell() {
		this.mark = Mark.EMPTY;
	}

	public Mark getMark() {
		return this.mark;
	}

	public void setMark(Mark mark) throws Exception {
		if (checkCellEmpty())
			this.mark = mark;
		else
			throw new RuntimeException("Cell is not Empty");
	}

	public boolean checkCellEmpty() {
		if (this.getMark() == Mark.EMPTY) {
			return true;
		}
		return false;
	}

}
