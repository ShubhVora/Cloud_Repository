package com.techlabs.abstractfactorypattern.test;

import com.techlabs.automobileinterface.IAutoMobile;
import com.techlabs.automobileinterface.IAutoMobileFactory;
import com.techlabs.factory.BMWFactory;

public class AbstractFactoryPatternTest {
	public static void main(String args[]) {
		IAutoMobileFactory factoryBMW = new BMWFactory();
		IAutoMobile bmw = factoryBMW.makeHatchBlack();
		bmw.start();
		bmw.stop();
	}
}
