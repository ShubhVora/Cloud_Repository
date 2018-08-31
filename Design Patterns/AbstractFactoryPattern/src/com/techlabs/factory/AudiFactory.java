package com.techlabs.factory;

import com.techlabs.audi.AudiHatchBlack;
import com.techlabs.audi.AudiSUV;
import com.techlabs.audi.AudiSudan;
import com.techlabs.automobileinterface.IAutoMobile;
import com.techlabs.automobileinterface.IAutoMobileFactory;

public class AudiFactory implements IAutoMobileFactory{

	@Override
	public IAutoMobile makeHatchBlack() {
		return new AudiHatchBlack();
	}

	@Override
	public IAutoMobile makeSudan() {
		return new AudiSudan();
	}

	@Override
	public IAutoMobile makeSUV() {
		return new AudiSUV();
	}

}
