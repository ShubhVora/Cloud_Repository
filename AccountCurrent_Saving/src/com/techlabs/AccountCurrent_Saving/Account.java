package com.techlabs.AccountCurrent_Saving;

public abstract class Account {
	private int accountNumber;
	private float balance;
	private String name;

	Account(int accountNumber, float balance, String name) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float amount) {
		this.balance = amount;
	}

	public String getName() {
		return name;
	}

	public abstract boolean withDraw(float amt);

}
