package com.techlabs.audi;

import com.techlabs.automobileinterface.IAutoMobile;

public class AudiHatchBlack implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("AudiHatchBlack starts.");
	}

	@Override
	public void stop() {
		System.out.println("AudiHatchBlack stops.");
	}

}
