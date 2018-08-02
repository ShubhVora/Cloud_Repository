package com.techlabs.opencloseprincipal.refactor.test;

import com.techlabs.opencloseprincipal.refactor.FixedDeposit;
import com.techlabs.opencloseprincipal.refactor.NormalRate;

public class FixedDepositTest {
	public static void main(String args[])
	{
		FixedDeposit fixedDeposit = new FixedDeposit("Shubham", 20.0, 4 , new NormalRate());
		
		System.out.println("Calculated Rate:\t"+ fixedDeposit.findRate());
		
		System.out.println("\nCalculated Interest:\t"+ fixedDeposit.calculateInterest());
	}

}
