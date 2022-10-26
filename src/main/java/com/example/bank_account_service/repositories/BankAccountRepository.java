package com.example.bank_account_service.repositories;

import com.example.bank_account_service.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository <BankAccount,String> {
}
