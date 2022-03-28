package com.fis.spring.repo;

import com.fis.spring.entity.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepo extends CrudRepository<Account, Long> {
    List<Account> findByAccountNumber(String accountNumber);
}
