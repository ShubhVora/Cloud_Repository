package com.techlabs.chapterseven.boat;

public class BoatTest {
	public static void main(String args[]){
		Boat b1 = new Boat();
		SailBoat b2 = new SailBoat();
		RowBoat b3= new RowBoat();
		
		b2.setLength(32);
		b1.move();
		b3.move();
		b2.move();
	}

}
