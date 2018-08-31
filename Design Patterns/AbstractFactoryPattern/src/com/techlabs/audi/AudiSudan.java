package com.techlabs.audi;

import com.techlabs.automobileinterface.IAutoMobile;

public class AudiSudan implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("AudiSudan starts.");

	}

	@Override
	public void stop() {
		System.out.println("AudiSudan stops.");
	}

}