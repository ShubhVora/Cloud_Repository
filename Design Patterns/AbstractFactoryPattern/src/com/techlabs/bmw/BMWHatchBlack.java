package com.techlabs.bmw;

import com.techlabs.automobileinterface.IAutoMobile;

public class BMWHatchBlack implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("BMWHatchBlack starts.");
		
	}

	@Override
	public void stop() {
		System.out.println("BMWHatchBlack stops.");
	}

}
