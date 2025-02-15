package com.techlabs.Reflection_App;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflection {

	int count = 0;

	public Constructor[] getConstructor(Class className) {
		Constructor[] cons = className.getDeclaredConstructors();
		return cons;
	}

	public Method[] getAllMethod(Class className) {
		Method[] method = className.getMethods();
		return method;
	}

	public void getSetterGetterMethod(Class className) {

		Method[] method = className.getDeclaredMethods();

		for (int i = 0; i < method.length; i++) {
			if (method[i].getName().startsWith("get") || method[i].getName().startsWith("set")) {
				count++;
				System.out.println(method[i].toString());
			}
		}
		System.out.println("Count of getter & setter method\t" + count);
	}

}
