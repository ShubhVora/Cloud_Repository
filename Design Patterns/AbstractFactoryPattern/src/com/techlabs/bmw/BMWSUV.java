package com.techlabs.bmw;

import com.techlabs.automobileinterface.IAutoMobile;

public class BMWSUV implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("BMWSUV starts.");
		
	}

	@Override
	public void stop() {
		System.out.println("BMWSUV stops.");
	}

}