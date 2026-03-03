/*
Question: Banking Management System - Account Model

Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

package model;

import java.io.Serializable;

public class Account implements Serializable {
    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return accountNumber + "," + name + "," + balance;
    }

    public static Account fromString(String data) {
        String[] parts = data.split(",");
        return new Account(
                Integer.parseInt(parts[0]),
                parts[1],
                Double.parseDouble(parts[2])
        );
    }
}