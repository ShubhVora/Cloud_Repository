package Account;

public class AccountTesting {
	public static void main(String args[]) {
		double amount = 50;
		Account account = new Account(900, "Shubham");
		Account account2 = new Account("Varshil");
		Account account3 = new Account("Manoj");
		Account maxAccount;
//		account.deposit(100);
	//	System.out.print("Updated Balance :\t" + account.getBalance());

		try{
			checkAmount(account,amount);
		} catch(Exception e) {
			System.out.println(e);
			
		}

	/*	maxAccount = account.whoIsRich(account2);
		System.out.print("\n\nDetails of Rich Account Houlder:\n" + maxAccount.getName() + maxAccount.getAccountNumber()
				+ maxAccount.getBalance());
		
		System.out.println(account.getAccountNumber());
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getAccountNumber());
		System.out.println(account.getAccountNumber());
		System.out.println(account3.getAccountNumber());
*/
	}
	
	
	static void checkAmount(Account account, double amount)throws InsufficientBalanceException
	{
		if (account.getBalance() < 1000 || account.getBalance() - amount < 100)
		{
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		
	}

}
