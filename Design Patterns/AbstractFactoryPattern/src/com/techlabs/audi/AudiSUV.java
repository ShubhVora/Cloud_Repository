package com.techlabs.audi;

import com.techlabs.automobileinterface.IAutoMobile;

public class AudiSUV implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("AudiSUV starts.");

	}

	@Override
	public void stop() {
		System.out.println("AudiSUV stops.");
	}

}