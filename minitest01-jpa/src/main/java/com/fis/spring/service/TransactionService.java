package com.fis.spring.service;

import com.fis.spring.entity.Transaction;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {

    Transaction transaction(Transaction transaction);
}
