package com.workintech.s18d4.service;

import com.workintech.s18d4.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccount();
    Account getAccountById(Long id);
    Account addAccount(Account account, Long id);
    Account updateAccount(Long id);
    Account deleteAccount(Long id);
}
