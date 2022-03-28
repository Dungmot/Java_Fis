package com.fis.spring.service.impl;

import com.fis.spring.entity.Account;
import com.fis.spring.repo.AccountRepo;
import com.fis.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;


@Component
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepo accountRepo;

    @Override
    public Account createAccount(Account account) {
        List<Account> list= accountRepo.findByAccountNumber(account.getAccountNumber());
        if(list.size()!=0) {
            return null;
        }
        if(account.getAccountNumber().length()!=12) {
            return null;
        }
        if(account.getAccountName().length()<=5||account.getAccountName().length()>=100) {
            return null;
        }
        account.setBalance(100000.0);
        account.setStatus(1);
        return accountRepo.save(account);
    }

    @Override
    public Account updateAccount(Account account) {
        Account kq=accountRepo.findById(account.getAccountId()).orElse(null);
        kq.setAccountName(account.getAccountName());
        kq.setStatus(account.getStatus());
        return accountRepo.save(kq);
    }

    @Override
    public String deleteAccount(Long accountId) {
        if(accountRepo.findById(accountId)!=null) {
            accountRepo.deleteById(accountId);
            return "Delete successfully";
        }
        return "Delete failed";
    }

    @Override
    public Account findAccountById(Long accountId) {
        return accountRepo.findById(accountId).orElse(null);
    }

    @Override
    public List<Account> findAllAccount() {
        return (List<Account>) accountRepo.findAll();
    }
}


/*
 Đánh dấu class bằng @Component
 Class này sẽ được Spring Boot hiểu là một Bean (hoặc dependency)
 Và sẽ được Spring Boot quản lý
 Khi gặp một class được đánh dấu @Component thì nó sẽ tạo ra một instance
 và đưa vào ApplicationContext để quản lý
*/
