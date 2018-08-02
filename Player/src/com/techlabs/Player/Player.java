package com.techlabs.Player;

public class Player {
	
	private String name;
	private int age, playerId;
	static int PlayerId;  // this initialised after class is load
	
	static{                  // this block is initialized before class is loaded
	       PlayerId=1;
	}
	
	Player(String name, int age)
	{
		this.name=name;
		this.age=age;
		this.playerId=PlayerId;
		PlayerId++;
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public int getPlayerId()
	{
		return this.playerId;
	}

}
