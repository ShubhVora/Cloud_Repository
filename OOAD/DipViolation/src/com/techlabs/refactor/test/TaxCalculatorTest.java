package com.techlabs.refactor.test;

import com.techlabs.refactor.TaxCalculator;
import com.techlabs.refactor.Xml;

public class TaxCalculatorTest {

	public static void main(String args[]){
		
	
	TaxCalculator cal = new TaxCalculator(new Xml());
	System.out.println(cal.Calculate(0, 0));
	
}
}
