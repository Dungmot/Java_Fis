package com.fis.spring.service.ipml;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.spring.dao.AccountDao;
import com.fis.spring.entity.Account;
import com.fis.spring.repo.AccountRepo;
import com.fis.spring.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountRepo accountRepo;
	
	@Autowired
	AccountDao accountDao;

	@Override
	public Account save(Account account) {
		account.setCreate_datatime(new Date());
		return accountRepo.save(account);
	}

	@Override
	public Account upDate(Account account) {
		account.setUpdate_datatime(new Date());
		Account account1 = accountRepo.save(account);
		return account1;
	}

	@Override
	public void deleteById(Long accontId) {
		accountRepo.deleteById(accontId);
	}

	@Override
	public Account getById(Long accontId) {
		return accountRepo.findById(accontId).orElse(null);
	}

	@Override
	public List<Account> getByAccountNumber(String accountNumber) {
		return accountDao.getByAccountNumber(accountNumber);
	}

}
