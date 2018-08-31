package com.techlabs.tictactoe;

public class ResultAnalyser {

	private IBoard board;

	public ResultAnalyser(IBoard board) {
		this.board = board;
	}

	public GameStatus checkGameStatus() {
		GameStatus status = checkHorizontal();
		if (status != GameStatus.PROGRESS) {
			return status;
		}
		if ((status = checkVertical()) != GameStatus.PROGRESS) {
			return status;
		}
		if ((status = checkDiagonal()) != GameStatus.PROGRESS) {
			return status;
		}

		return GameStatus.PROGRESS;

	}

	public GameStatus checkHorizontal() {
		GameStatus status = GameStatus.PROGRESS;
		for (int row = 0; row < board.getBoardType(); row++) {
			int matchFound = 0;
			status = CheckRowCells(row, matchFound);
			if (status != GameStatus.PROGRESS)
				break;
		}
		return status;
	}

	private GameStatus CheckRowCells(int row, int matchFound) {
		for (int column = board.getBoardType() - 1; column > 0; column--) {
			if (board.getBoard()[row][column].getMark() != Mark.EMPTY
					&& board.getBoard()[row][0].getMark() == board.getBoard()[row][column].getMark()) {
				matchFound++;
			}
		}
		return checkRowCurrentStatus(row, matchFound);
	}

	private GameStatus checkRowCurrentStatus(int row, int matchFound) {
		if (matchFound == (board.getBoardType() - 1)) {
			return getWinStatus(row);
		}
		return GameStatus.PROGRESS;
	}

	private GameStatus getWinStatus(int row) {
		if (board.getBoard()[row][0].getMark() == Mark.O)
			return GameStatus.WON_O;
		return GameStatus.WON_X;
	}

	public GameStatus checkVertical() {
		return checkColumn();
	}

	private GameStatus checkColumn() {
		GameStatus status = GameStatus.PROGRESS;
		for (int row = 0; row < board.getBoardType(); row++) {
			int matchFound = 0;
			status = CheckColumnCell(row, matchFound);
			if (status != GameStatus.PROGRESS)
				break;
		}
		return status;
	}

	private GameStatus CheckColumnCell(int row, int matchFound) {
		for (int column = board.getBoardType() - 1; column > 0; column--) {
			if (board.getBoard()[column][row].getMark() != Mark.EMPTY
					&& board.getBoard()[0][row].getMark() == board.getBoard()[column][row].getMark()) {
				matchFound++;
			}
		}

		return checkColumnCurrentStatus(row, matchFound);
	}

	private GameStatus checkColumnCurrentStatus(int row, int matchFound) {
		if (matchFound == (board.getBoardType() - 1)) {
			if (board.getBoard()[0][row].getMark() == Mark.O)
				return GameStatus.WON_O;

			return GameStatus.WON_X;
		}
		return GameStatus.PROGRESS;
	}

	public GameStatus checkDiagonal() {
		GameStatus decreaseStatus = checkDecreasingDiagonal();
		GameStatus increaseStatus = checkIncreasingDiagonal();

		if (decreaseStatus != GameStatus.PROGRESS) {
			return decreaseStatus;
		}
		if (increaseStatus != GameStatus.PROGRESS) {
			return increaseStatus;
		}
		return GameStatus.PROGRESS;

	}

	private GameStatus checkIncreasingDiagonal() {
		int matchFound = 0;
		for (int i = 1, j = board.getBoardType() - 1, k = j - 1; i < board.getBoardType(); i++, k--) {
			if (board.getBoard()[i][k].getMark() != Mark.EMPTY
					&& board.getBoard()[0][j].getMark() == board.getBoard()[i][k].getMark()) {
				matchFound++;
			}
		}

		if (matchFound == board.getBoardType() - 1) {
			if (board.getBoard()[0][board.getBoardType() - 1].getMark() == Mark.O)
				return GameStatus.WON_O;

			return GameStatus.WON_X;
		}

		return GameStatus.PROGRESS;
	}

	private GameStatus checkDecreasingDiagonal() {
		int matchFound = 0;
		for (int row = 1, column = 1; row < board.getBoardType(); row++, column++) {
			if (row == column) {
				if (board.getBoard()[row][column].getMark() != Mark.EMPTY
						&& board.getBoard()[0][0].getMark() == board.getBoard()[row][column].getMark()) {
					matchFound++;
				}
			}
		}

		if (matchFound == board.getBoardType() - 1) {
			if (board.getBoard()[0][0].getMark() == Mark.O)
				return GameStatus.WON_O;

			return GameStatus.WON_X;
		}
		return GameStatus.PROGRESS;
	}

}
