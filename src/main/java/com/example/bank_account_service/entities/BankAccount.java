package com.example.bank_account_service.entities;

import com.example.bank_account_service.enums.AccountType;

import java.util.Date;

public class BankAccount {
    private String id;
    private Date createdAt;
    private double balance;
    private String currency;
    private AccountType type;
}
