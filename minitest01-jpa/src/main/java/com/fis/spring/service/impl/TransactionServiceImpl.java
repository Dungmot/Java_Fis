package com.fis.spring.service.impl;

import com.fis.spring.entity.Account;
import com.fis.spring.entity.Transaction;
import com.fis.spring.repo.AccountRepo;
import com.fis.spring.repo.TransactionRepo;
import com.fis.spring.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;

@Component
public class TransactionServiceImpl extends Transaction implements TransactionService{

    @Autowired
    TransactionRepo transactionRepo;

    @Autowired
    AccountRepo accountRepo;

    @Override
    public Transaction transaction(Transaction transaction) {
        Account fromAccount = (Account) accountRepo.findByAccountNumber(String.valueOf(transaction.getFromAccount()));
        Account toAccount = (Account) accountRepo.findByAccountNumber(String.valueOf(transaction.getToAccount()));
        Transaction transactionSave = new Transaction();
        if (fromAccount.getStatus()==0||fromAccount.getStatus()==2){
            transaction.setStatus(0);
            transaction.setErrorReason("Tài khoản nguồn không hợp lệ");
        }else if(toAccount.getStatus()==0||toAccount.getStatus()==2){
            transaction.setStatus(0);
            transaction.setErrorReason("Tài khoản đích không hợp lệ");
        }else if(fromAccount.getBalance()<transaction.getAmount()){
            transaction.setStatus(0);
            transaction.setErrorReason("Số dư tài khoản nguồn không đủ");
        }else if(transaction.getStatus()==1){
            transaction.setTransactionDate(transaction.getTransactionDate());
            fromAccount.setBalance(fromAccount.getBalance() - transaction.getAmount());
            toAccount.setBalance(toAccount.getBalance() + transaction.getAmount());
            accountRepo.save(fromAccount);
            accountRepo.save(toAccount);
            transaction.setAmount(transaction.getAmount());
            transaction.setContent(transaction.getContent());
            transaction.setErrorReason(transaction.getErrorReason());
            transactionRepo.save(transactionSave);
        }else{
            transactionRepo.save(transactionSave);
        }
        return transactionSave;
    }
}
