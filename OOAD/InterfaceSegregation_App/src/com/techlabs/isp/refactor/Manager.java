package com.techlabs.isp.refactor;

public class Manager implements IWorker {
	public void startWork() {
		System.out.println("Manager starts work");
	}

	public void stopWork() {
		System.out.println("Manager stops work");
	}

	public void startEat() {
		System.out.println("Manager starts eating");
	}

	public void stopEat() {
		System.out.println("Manager stops eating");
	}

}
