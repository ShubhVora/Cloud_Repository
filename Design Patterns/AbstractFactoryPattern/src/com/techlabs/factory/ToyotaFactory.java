package com.techlabs.factory;

import com.techlabs.automobileinterface.IAutoMobile;
import com.techlabs.automobileinterface.IAutoMobileFactory;
import com.techlabs.toyota.ToyotaHatchBlack;
import com.techlabs.toyota.ToyotaSUV;
import com.techlabs.toyota.ToyotaSudan;

public class ToyotaFactory implements IAutoMobileFactory{

	@Override
	public IAutoMobile makeHatchBlack() {
		return new ToyotaHatchBlack();
	}

	@Override
	public IAutoMobile makeSudan() {
		return new ToyotaSudan();
	}

	@Override
	public IAutoMobile makeSUV() {
		return new ToyotaSUV();
	}
	
	

}
