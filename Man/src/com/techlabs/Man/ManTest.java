package com.techlabs.Man;

public class ManTest {
	public static void main(String args[])
	{
		
		ManTest mantest= new ManTest();
		Boy boy = new Boy();
		Infants infant = new Infants();
		Kids kid = new Kids();
		
		Man x = (Man)new Boy();
		
	
		
		mantest.playGround(boy);
		mantest.playGround(infant);
		mantest.playGround(kid);
		mantest.playGroundNext(x);
		
	}
	
	static void playGround(Man object)
	{
		object.play();
	}
	static void playGroundNext(Man object)
	{
		object.read();
		object.walk();
		object.play();
		object.eat();
	}

}
