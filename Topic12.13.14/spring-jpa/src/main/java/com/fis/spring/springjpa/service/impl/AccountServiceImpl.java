package com.fis.spring.springjpa.service.impl;

import com.fis.spring.springjpa.dao.AccountDao;
import com.fis.spring.springjpa.entity.Account;
import com.fis.spring.springjpa.repo.AccountRepo;
import com.fis.spring.springjpa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepo accountRepo;

    @Autowired
    AccountDao accountDao;

    @Override
    public Account save(Account account) {
        //Validate accountNo đã tồn tại -> ko ddc insert vào
        account.setIssuedDate(new Date());
        return accountRepo.save(account);
    }

    @Override
    public Account upDate(Account account) {
        //Validate accountNo có tồn tại không -> ko  update
        account.setUpdateDate(new Date());
        Account account1 =  accountRepo.save(account);
        //Lưu lịch sử cập nhật vào bảng ACCOUNT_HISTORY: accountHistoryService
        return account1;
    }

    @Override
    public void deleteById(Long accontId) {
        //get Account theo accountId
        //Cập nhật account thành Inactive
        accountRepo.deleteById(accontId);
    }

    @Override
    public Account getById(Long accontId) {
        return accountRepo.findById(accontId).orElse(null);
    }

    @Override
    public List<Account> getByFullname(String fullname) {
        return accountRepo.getByFullname(fullname);
    }
}
