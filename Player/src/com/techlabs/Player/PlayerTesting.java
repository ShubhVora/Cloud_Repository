package com.techlabs.Player;

public class PlayerTesting {
	public static void main(String args[]) {
		Player player1 = new Player("Shubham", 20);
		Player player2 = new Player("Varshil", 22);
		Player player3 = new Player("Manoj", 24);

		printDetails(player1);
		printDetails(player2);
		printDetails(player3);

	}

	static void printDetails(Player player1) {
		System.out.println("Name of Player:\t" + player1.getName());
		System.out.println("Age of Player:\t" + player1.getAge());
		System.out.println("PlayerID:\t" + player1.getPlayerId() + "\n");
	}
}
