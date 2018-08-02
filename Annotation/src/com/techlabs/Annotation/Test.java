package com.techlabs.Annotation;

import java.lang.reflect.Method;

public class Test {
	public static void main(String args[]) throws Exception {
		Annotation an = new Annotation();
		Test.countAnnotationsInClass(Annotation.class, MyAnnotation.class);

	}

	public static void countAnnotationsInClass(Class<Annotation> testClass, Class<MyAnnotation> annotation) {
		int count = 0;
		for (Method m : testClass.getMethods()) {
			if (m.isAnnotationPresent(annotation)) {
				System.out.println("Method Name:\t" + m.getName());
				count++;
			}
		}

		System.out.println("Total Annotation methods are:\t" + count);
	}
}
