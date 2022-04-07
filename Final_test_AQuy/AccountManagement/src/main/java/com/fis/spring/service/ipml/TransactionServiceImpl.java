package com.fis.spring.service.ipml;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.aspectj.bridge.AbortException;
import org.springframework.beans.factory.annotation.Autowired;

import com.fis.spring.entity.Account;
import com.fis.spring.entity.Transaction;
import com.fis.spring.repo.TransactionRepo;
import com.fis.spring.service.AccountService;
import com.fis.spring.service.TransactionService;

public class TransactionServiceImpl implements TransactionService{

	@Autowired
    TransactionRepo transactionRepo;

    @Autowired
    AccountService accountService;
    
	@Override
	public Transaction transfer(Transaction transaction) {
		Account from = accountService.getById(transaction.getFromAccount().getId());
        Account to = accountService.getById(transaction.getToAccount().getId());
        
        from.setBalance(from.getBalance() - transaction.getAmount());
        to.setBalance(to.getBalance() + transaction.getAmount());
        accountService.save(from);
        accountService.save(to);
        return transactionRepo.save(transaction);
	}

	@Override
	public Transaction save(Transaction transaction) {
		return transactionRepo.save(transaction);
	}

	@Override
	public List<Transaction> findByAccountNumberAndTime(String accountNumber, String create, String update) {
		 Account account = accountService.findByAccountNumberAndTime(accountNumber);
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	        return transactionRepo.findTransactionsByAccountNumberAndTime(account.getAccountNumber(),
	                LocalDateTime.parse(create, formatter),
	                LocalDateTime.parse(update, formatter));
	}

	@Override
	public List<Transaction> findAllByDate(String create, String update) {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	        LocalDateTime fromDate = LocalDateTime.parse(create, formatter);
	        LocalDateTime toDate = LocalDateTime.parse(update, formatter);
	        Long daysBetween = ChronoUnit.DAYS.between(fromDate, toDate);
	        if(daysBetween > 60){
	            throw new AbortException();
	        }
	        return transactionRepo.findAllByDate(fromDate, toDate);
	}

}
