/*
Question: Banking Management System - File Handler

Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

package util;

import model.Account;
import java.io.*;
import java.util.*;

public class FileHandler {

    private static final String FILE_PATH = "data/accounts.txt";

    public static void saveAccounts(List<Account> accounts) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Account acc : accounts) {
                writer.println(acc.toString());
            }
        } catch (IOException e) {
            System.out.println("Error saving accounts.");
        }
    }

    public static List<Account> loadAccounts() {
        List<Account> accounts = new ArrayList<>();

        File file = new File(FILE_PATH);
        if (!file.exists()) return accounts;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                accounts.add(Account.fromString(line));
            }
        } catch (IOException e) {
            System.out.println("Error loading accounts.");
        }

        return accounts;
    }
}