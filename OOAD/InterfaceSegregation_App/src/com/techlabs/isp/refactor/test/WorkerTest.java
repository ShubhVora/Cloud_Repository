package com.techlabs.isp.refactor.test;

import com.techlabs.isp.refactor.IEatable;
import com.techlabs.isp.refactor.IWorkable;
import com.techlabs.isp.refactor.IWorker;
import com.techlabs.isp.refactor.Manager;
import com.techlabs.isp.refactor.Robot;

public class WorkerTest {
	public static void main(String args[]) {
		Manager manager = new Manager();
		Robot robot = new Robot();

		atTheWorkstaion(manager);
		atTheCafetena(manager);
		atTheWorkstaion(robot);

	}

	public static void atTheCafetena(IEatable object) {
		object.startEat();
		object.stopEat();
	}

	public static void atTheWorkstaion(IWorkable object) {
		object.startWork();
		object.stopWork();
	}
}
