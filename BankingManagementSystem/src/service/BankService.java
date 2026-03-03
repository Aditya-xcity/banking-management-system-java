/*
Question: Banking Management System - Service Layer

Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

package service;

import model.Account;
import util.FileHandler;
import java.util.*;

public class BankService {

    private List<Account> accounts;

    public BankService() {
        accounts = FileHandler.loadAccounts();
    }

    public void createAccount(int accNo, String name, double balance) {
        accounts.add(new Account(accNo, name, balance));
        FileHandler.saveAccounts(accounts);
        System.out.println("Account created successfully!");
    }

    public Account findAccount(int accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    public void deposit(int accNo, double amount) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.deposit(amount);
            FileHandler.saveAccounts(accounts);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdraw(int accNo, double amount) {
        Account acc = findAccount(accNo);
        if (acc != null && acc.withdraw(amount)) {
            FileHandler.saveAccounts(accounts);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance or account not found!");
        }
    }

    public void showAllAccounts() {
        for (Account acc : accounts) {
            System.out.println("Acc No: " + acc.getAccountNumber() +
                    " | Name: " + acc.getName() +
                    " | Balance: ₹" + acc.getBalance());
        }
    }
}