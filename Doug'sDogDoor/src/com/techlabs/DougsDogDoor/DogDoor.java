package com.techlabs.DougsDogDoor;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;
	private String allowedBark;

	public DogDoor() {
		this.open = false;
	}

	public void setAllowedBark(String Bark) {
		this.allowedBark = Bark;
	}

	public String getAllowedBark() {
		return this.allowedBark;
	}

	public void open() {
		System.out.println("\nThe Dog Door opens.");
		open = true;

		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}

	public void close() {
		System.out.println("\nThe Dog Door closes.");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

}
