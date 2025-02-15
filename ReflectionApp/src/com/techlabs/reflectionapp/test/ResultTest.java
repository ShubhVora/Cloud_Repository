package com.techlabs.reflectionapp.test;

import java.lang.reflect.Method;

import com.techlabs.reflectionapp.Foo;
import com.techlabs.reflectionapp.ProTest;

public class ResultTest {
	public static void main(String args[]) throws Exception {

		int proTestPassed = 0, proTestFailed = 0;
		Foo fooObject = new Foo();

		for (Method method : Foo.class.getMethods()) {
			if (method.isAnnotationPresent(ProTest.class)) {
				if ((boolean) method.invoke(fooObject)) {
					System.out.println(method.getName());
					proTestPassed++;

				} else if (!(boolean) method.invoke(fooObject)) {
					System.err.println(method.getName());
					proTestFailed++;
				}
			}
		}
		System.out.println(proTestPassed);
		System.out.println(proTestFailed);

	}

}
