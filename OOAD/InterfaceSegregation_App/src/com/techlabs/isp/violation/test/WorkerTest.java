package com.techlabs.isp.violation.test;

import com.techlabs.isp.violation.IWorker;
import com.techlabs.isp.violation.Manager;
import com.techlabs.isp.violation.Robot;

public class WorkerTest {
	public static void main(String args[])
	{
		Manager manager = new Manager();
		Robot robot =new Robot();
		
		atTheCafetena(manager);
		atTheWorkstaion(manager);
		atTheWorkstaion(robot);
		atTheCafetena(robot);
	}
	public static void atTheCafetena(IWorker object)
	{
		object.startEat();
		object.stopEat();
	}
	public static void atTheWorkstaion(IWorker object)
	{
		object.startWork();
		object.stopWork();
	}

}
