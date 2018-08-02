package com.techlabs.dipviolation.test;

import com.techlabs.dipviolation.LogType;
import com.techlabs.dipviolation.TaxCalculator;

public class TaxCalculatorTest {
	
	public static void main(String args[])throws Exception{
		TaxCalculator cal = new TaxCalculator(LogType.XML);
		System.out.println(cal.Calculate(0, 0));
		
	}

}
