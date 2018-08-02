package com.techlabs.Reflection_App;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String args[]) {
		Class className = Object.class;
		Reflection object = new Reflection();

		Constructor[] cons = object.getConstructor(className);
		for (Constructor con : cons)
			System.out.println(con.toString());
		System.out.println("Count of counstructor\t "+cons.length);

		System.out.println("\n");

		Method[] methods = object.getAllMethod(className);
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].toString());
		}
		System.out.println("Count of methods\t "+methods.length);

		System.out.println("\n\n\n\n\n");

	  object.getSetterGetterMethod(className);
	}
}
