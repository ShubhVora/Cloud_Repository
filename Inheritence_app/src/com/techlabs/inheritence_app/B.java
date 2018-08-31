package com.techlabs.inheritence_app;

public class B extends A {

	B() {// bydefault the constructor of A is called by placing super keyword.
			// This happens because
			// B extends A
		System.out.println("B is present");
	}
}
