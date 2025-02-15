package com.techlabs.observerpattern;

public class EmailListner implements IListner {
	public void sendEmail(String type, double balance) {
		System.out.println("Email:After performing " + type + " new balance is " + balance);
	}

	@Override
	public void balanceChanged(Account account, String type) {
		sendEmail(type, account.getBalance());
	}
}
