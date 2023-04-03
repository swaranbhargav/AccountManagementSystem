package com.bridgelabz.accountmanagementsystem;

class AccountManagement extends Account {

	public Account addAccountDetails(String accountNumber, String accountHolderName, String accountHolderDob,
			String accountHolderMobileNumber, String accountHolderEmail, String accountBankBalance) {
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setAccountHolderName(accountHolderName);
		account.setAccountHolderDob(accountHolderDob);
		account.setAccountHolderMobileNumber(accountHolderMobileNumber);
		account.setAccountHolderEmail(accountHolderEmail);
		return account;
	}

	public void displayAccountDetails(Account account) {
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Account Holder Name: " + account.getAccountHolderName());
		System.out.println("Account Holder DOB: " + account.getAccountHolderDob());
		System.out.println("Account Holder Mobile Number: " + account.getAccountHolderMobileNumber());
		System.out.println("Account Holder Email: " + account.getAccountHolderEmail());

	}

	public void displayBankBalance(BankBalance bankBalance) {
		displayBankBalance(bankBalance);
		System.out.println("Savings Account Balance: " + bankBalance.getBalance());
	}

}
