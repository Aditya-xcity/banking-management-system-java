/*
Question: Banking Management System - Main Class

Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

import service.BankService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService();

        while (true) {
            System.out.println("\n===== Banking Management System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show All Accounts");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();
                    bank.createAccount(accNo, name, balance);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double deposit = sc.nextDouble();
                    bank.deposit(accNo, deposit);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double withdraw = sc.nextDouble();
                    bank.withdraw(accNo, withdraw);
                    break;

                case 4:
                    bank.showAllAccounts();
                    break;

                case 5:
                    System.out.println("Thank you for using the system.");
                    System.exit(0);

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}