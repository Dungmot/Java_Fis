package com.fis.spring.service;

import java.util.List;

import com.fis.spring.entity.Account;

public interface AccountService {
	
	Account save(Account account);

	Account upDate(Account account);

	void deleteById(Long accontId);

	Account getById(Long accontId);

	List<Account> getByAccountNumber(String accountNumber);
	
	boolean existById(Long id);
}
