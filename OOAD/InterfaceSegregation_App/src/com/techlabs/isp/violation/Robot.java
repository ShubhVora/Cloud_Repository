package com.techlabs.isp.violation;

public class Robot implements IWorker{

	public void startWork()
	{
		System.out.println("Robot starts work");
	}
	public void stopWork()
	{
		System.out.println("Robot stops work");
	}
	public void startEat(){
		throw new RuntimeException("Robot does'nt eat");
	}
	public void stopEat(){
		throw new RuntimeException("Robot does'nt eat");
	}
}
