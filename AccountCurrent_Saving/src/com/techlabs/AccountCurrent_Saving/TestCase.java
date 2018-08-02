package com.techlabs.AccountCurrent_Saving;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {

	@Test
	public void test1() {
		Current_Account object1 = new Current_Account(1000, "ABC");
		assertTrue(true == object1.withDraw(5000));
	}

	@Test
	public void test2() {
		Saving_Account object2 = new Saving_Account(1000, "ABC");
		assertTrue(false == object2.withDraw(5000));
	}

}
