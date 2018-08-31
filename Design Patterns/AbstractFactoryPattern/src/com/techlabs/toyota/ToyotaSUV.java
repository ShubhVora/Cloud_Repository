package com.techlabs.toyota;

import com.techlabs.automobileinterface.IAutoMobile;

public class ToyotaSUV implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("ToyotaSUV starts.");
		
	}

	@Override
	public void stop() {
		System.out.println("ToyotaSUV stops.");
	}

}