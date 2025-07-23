package com.hema.assignment3;

public class BankDemo {

	public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        System.out.println("Total Accounts: " + Bank.getTotalAccounts());

        Account savings = new SavingsAccount("Hem", 5000);
        Account checking = new CheckingAccount("Abi", 3000);

        Account savings1 = new SavingsAccount("Deepi", 5000);
        Account checking1 = new CheckingAccount("Harshu", 3000);

        Transaction txn = new Transaction();
        txn.performTransaction(savings, "deposit", 1000);
        txn.performTransaction(checking, "withdraw", 500);
        
        txn.performTransaction(savings1, "deposit", 10000);
        txn.performTransaction(checking1, "withdraw", 900);
    }
}