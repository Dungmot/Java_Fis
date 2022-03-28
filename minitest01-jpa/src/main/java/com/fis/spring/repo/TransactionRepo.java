package com.fis.spring.repo;

import com.fis.spring.entity.Account;
import com.fis.spring.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionRepo extends CrudRepository<Transaction, Long> {
    List<Account> findByTransactionId(String transactionId);
}
