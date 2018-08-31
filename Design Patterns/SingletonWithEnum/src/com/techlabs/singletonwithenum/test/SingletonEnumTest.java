package com.techlabs.singletonwithenum.test;

import com.techlabs.singletonwithenum.Singleton;

public class SingletonEnumTest {
	public static void main(String args[]) {

		Singleton instance = Singleton.INSTANCE;

		System.out.println(instance.getValue());
		instance.setValue(5);
		System.out.println(instance.getValue());
		
		Singleton instance12 = Singleton.INSTANCE;
		
		System.out.println(instance.hashCode());
		System.out.println(instance12.hashCode());
	}

}
