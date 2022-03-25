package com.fis.spring.springjpa.dao;

import com.fis.spring.springjpa.entity.Account;

import java.util.List;

public interface AccountDao {
    List<Account> getByFullname(String fullname);
}
