package com.bankapp;
import java.util.HashMap;
import java.util.Map;

public class AccountDatabase {
    private static Map<String, Account> accounts = new HashMap<>();

    static {
        accounts.put("123456", new Account("123456", "Arun@5115", "Arun", 5100.60));
        accounts.put("654321", new Account("654321", "Manojj", "Manoj", 7950.30));
    }

    public static Account getAccount(String accountNumber, String password) {
        Account acc = accounts.get(accountNumber);
        if (acc != null && acc.getPassword().equals(password)) {
            return acc;
        } else {
            return null;
        }
    }
}
