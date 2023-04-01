package com.bridgelabz.accountmanagementsystem;

import java.util.Scanner;

public class AccountManagementSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to account management System ");
		System.out.println("Enter account details");
		AccountManagement accountManagement = new AccountManagement();

		System.out.print("Enter your account number: ");
		String accountNumber = scanner.next();

		System.out.print("Enter account holder name: ");
		String accountHolderName = scanner.next();

		System.out.print("Enter account holder DOB (dd/mm/yyyy): ");
		String accountHolderDob = scanner.next();

		System.out.print("Enter account holder mobile number: ");
		String accountHolderMobileNumber = scanner.next();

		System.out.print("Enter account holder email: ");
		String accountHolderEmail = scanner.next();

		System.out.println("Enter your bank balance");
		String accountBankBalance = scanner.next();

		Account account = accountManagement.addAccountDetails(accountNumber, accountHolderName, accountHolderDob,
				accountHolderMobileNumber, accountHolderEmail, accountBankBalance);

		accountManagement.displayAccountDetails(account);

	}

}
