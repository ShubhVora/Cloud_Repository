package com.techlabs.factory;

import com.techlabs.automobileinterface.IAutoMobile;
import com.techlabs.automobileinterface.IAutoMobileFactory;
import com.techlabs.bmw.BMWHatchBlack;
import com.techlabs.bmw.BMWSUV;
import com.techlabs.bmw.BMWSudan;

public class BMWFactory implements IAutoMobileFactory{

	@Override
	public IAutoMobile makeHatchBlack() {
		return new BMWHatchBlack();
	}

	@Override
	public IAutoMobile makeSudan() {
		return new BMWSudan();
	}

	@Override
	public IAutoMobile makeSUV() {
		return new BMWSUV();
	}

}
