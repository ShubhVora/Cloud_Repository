package com.techlabs.operationstrategy.test;

import com.techlabs.operationstrategy.Context;
import com.techlabs.operationstrategy.DoAddition;
import com.techlabs.operationstrategy.DoMultiplication;
import com.techlabs.operationstrategy.DoSubtraction;

public class ContextTest {
	public static void main(String args[]) {
		
		Context context = new Context(new DoAddition());
		System.out.println("Result of Operation:\t" + context.executeStrategy(7, 9));
		
		Context contextObject1 = new Context(new DoSubtraction());
		System.out.println("Result of Operation:\t" + contextObject1.executeStrategy(7, 9));
		
		Context contextObject2 = new Context(new DoMultiplication());
		System.out.println("Result of Operation:\t" + contextObject2.executeStrategy(7, 9));
	}

}
