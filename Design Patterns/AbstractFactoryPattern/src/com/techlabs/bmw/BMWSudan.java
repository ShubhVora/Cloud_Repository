package com.techlabs.bmw;

import com.techlabs.automobileinterface.IAutoMobile;

public class BMWSudan implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("BMWSudan starts.");
		
	}

	@Override
	public void stop() {
		System.out.println("BMWSudan stops.");
	}

}