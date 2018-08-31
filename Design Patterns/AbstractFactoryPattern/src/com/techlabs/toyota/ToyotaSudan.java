package com.techlabs.toyota;

import com.techlabs.automobileinterface.IAutoMobile;

public class ToyotaSudan implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("ToyotaSudan starts.");
		
	}

	@Override
	public void stop() {
		System.out.println("ToyotaSudan stops.");
	}

}