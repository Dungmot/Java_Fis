package com.fis.spring.service;

import java.util.List;

import com.fis.spring.entity.Transaction;

public interface TransactionService {

	Transaction transfer(Transaction transaction);

    Transaction save(Transaction transaction);

    List<Transaction> findByAccountNumberAndTime(String accountNumber, String create, String update);

    List<Transaction> findAllByDate(String create, String update);

}
