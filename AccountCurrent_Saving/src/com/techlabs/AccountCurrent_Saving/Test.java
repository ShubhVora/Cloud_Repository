package com.techlabs.AccountCurrent_Saving;

public class Test {

	public static void main(String args[]) {
		Saving_Account savingAccount = new Saving_Account(6000, "Shubham");
		Current_Account currentAccount = new Current_Account(500, "Shubh");

		System.out.println("WithDrawal Status:\t" + savingAccount.withDraw(1000));

		System.out.println("Balance After Withdrawal for Saving Account\n " + savingAccount.getName() + "\t"
				+ savingAccount.getAccountNumber() + "\t" + savingAccount.getBalance());

		System.out.println("\n\nWithDrawal Status:\t" + currentAccount.withDraw(1000));

		System.out.println("Balance After Withdrawal for Current Account\n " + currentAccount.getName() + "\t"
				+ currentAccount.getAccountNumber() + "\t" + currentAccount.getBalance());

		System.out.println("OverDraft Amount " + currentAccount.getOverDraft());
	}

}
