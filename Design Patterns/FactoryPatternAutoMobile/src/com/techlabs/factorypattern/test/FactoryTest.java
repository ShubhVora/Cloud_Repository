package com.techlabs.factorypattern.test;

import com.techlabs.factorypattern.AudiFactory;
import com.techlabs.factorypattern.BMWFactory;
import com.techlabs.factorypattern.IAutoFactory;
import com.techlabs.factorypattern.IAutoMobile;
import com.techlabs.factorypattern.ToyotaFactory;

public class FactoryTest {

	public static void main(String args[]) {
		IAutoFactory factory = new BMWFactory();
		IAutoMobile bmw = factory.make();

		factory = new AudiFactory();
		IAutoMobile audi = factory.make();
		
		factory = new ToyotaFactory();
		IAutoMobile toyota = factory.make();

		bmw.start();
		bmw.stop();
		audi.start();
		audi.stop();
		toyota.start();
		toyota.stop();
	}
}
