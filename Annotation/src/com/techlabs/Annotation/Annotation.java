package com.techlabs.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
	int value();
}

public class Annotation {

	@MyAnnotation(value = 10)
	public void A() {
		System.out.println("A");
	}

	@MyAnnotation(value = 20)
	public void B() {
		System.out.println("B");
	}

	@MyAnnotation(value = 30)
	public void C() {
		System.out.println("C");
	}

	@MyAnnotation(value = 40)
	public void D() {
		System.out.println("D");
	}

	public void E() {
		System.out.println("E");
	}
}
