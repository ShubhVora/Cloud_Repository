package com.techlabs.toyota;

import com.techlabs.automobileinterface.IAutoMobile;

public class ToyotaHatchBlack implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("ToyotaHatchBlack starts.");
		
	}

	@Override
	public void stop() {
		System.out.println("ToyotaHatchBlack stops.");
	}

}