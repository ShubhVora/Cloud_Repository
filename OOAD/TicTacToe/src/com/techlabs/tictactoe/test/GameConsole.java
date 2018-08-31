package com.techlabs.tictactoe.test;

import java.util.Scanner;

import com.techlabs.tictactoe.Cell;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.GameStatus;
import com.techlabs.tictactoe.IBoard;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.NineBoard;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.ResultAnalyser;

public class GameConsole {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		GameStatus status = GameStatus.PROGRESS;
		IBoard board = new NineBoard();
		ResultAnalyser resultAnalyser = new ResultAnalyser(board);
		Player[] player = new Player[2];

		System.out.println("For 1st player, enter 0 for X & 1 for O:\t");
		int choice = sc.nextInt();
		System.out.println("Enter 1st player's Name:\t");
		String playerOneName = sc.next();
		System.out.println("Enter 2nd player's Name:\t");
		String playerTwoName = sc.next();

		if (choice == 0) {
			player[0] = new Player(playerOneName, Mark.X);
			player[1] = new Player(playerTwoName, Mark.O);
		} else {
			player[0] = new Player(playerOneName, Mark.O);
			player[1] = new Player(playerTwoName, Mark.X);
		}

		Game game = new Game(player, board, resultAnalyser);

		do {
			System.out.println("Enter the row:\t");
			int row = sc.nextInt();
			System.out.println("Enter the Column:\t");
			int column = sc.nextInt();
			status = game.play(row, column);
			display(game.getBoard(), status, game);
		} while ((game.isBoardFull() == false && status == GameStatus.PROGRESS && status == GameStatus.PROGRESS)
				|| status == GameStatus.NOTEMPTY);

		sc.close();

	}

	public static void display(IBoard board, GameStatus status, Game game) {

		Cell[][] boardArray = board.getBoard();
		System.out.println();
		for (int i = 0; i < board.getBoardType(); i++) {
			for (int j = 0; j < board.getBoardType(); j++) {
				System.out.print("\t" + boardArray[i][j].getMark() + "\t");
			}
			System.out.println();
		}
		if (game.isBoardFull() == false || status != GameStatus.PROGRESS)
			System.out.println("Status of Game:\t" + status);
		else
			System.out.println("Status of Game:\t Draw");

	}

}
