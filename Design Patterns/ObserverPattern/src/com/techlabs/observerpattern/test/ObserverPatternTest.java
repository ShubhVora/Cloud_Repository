package com.techlabs.observerpattern.test;

import java.util.ArrayList;

import com.techlabs.observerpattern.Account;
import com.techlabs.observerpattern.EmailListner;
import com.techlabs.observerpattern.IListner;
import com.techlabs.observerpattern.SMSListner;

public class ObserverPatternTest {
	public static void main(String[] args) {
		ArrayList<IListner> listeners = new ArrayList<IListner>();
		listeners.add(new SMSListner());
		listeners.add(new EmailListner());
		Account account1 = new Account(111, "ABC", 15000, listeners);
		Account account2 = new Account(112, "XYZ", 2500, listeners);

		account1.withDraw(500);

		account2.deposit(5000);

	}

}
