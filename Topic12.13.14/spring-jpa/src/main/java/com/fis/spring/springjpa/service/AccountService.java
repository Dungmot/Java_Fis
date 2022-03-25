package com.fis.spring.springjpa.service;

import com.fis.spring.springjpa.entity.Account;

import java.util.List;

public interface AccountService {
    Account save(Account account);
    Account upDate(Account account);
    void deleteById(Long accontId);
    Account getById(Long accontId);
    List<Account> getByFullname(String fullname);
}
