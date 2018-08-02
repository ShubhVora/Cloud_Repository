package com.techlabs.DougsDogDoor;

public class BarkRecognizer {

	private DogDoor door;

	public BarkRecognizer(DogDoor dogDoor) {
		this.door = dogDoor;

	}

	public void recognize(String bark) {
		System.out.println("   BarkRecognizor :Heard  a '" + bark + "'");
		door.open();
	}

}
