package com.workintech.s18d4.service;

import com.workintech.s18d4.dao.AccountRepository;
import com.workintech.s18d4.entity.Account;

import java.util.List;
import java.util.Optional;

public class AccountServiceImpl implements AccountService{
    AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(Long id) {
        Optional<Account> optionalAccount = accountRepository.findById(id);
        return optionalAccount.orElse(null);
    }

    @Override
    public Account addAccount(Account account, Long id) {
        return null;
    }

    @Override
    public Account updateAccount(Long id) {
        return null;
    }

    @Override
    public Account deleteAccount(Long id) {
        return null;
    }
}
