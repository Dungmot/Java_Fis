package com.fis.spring.controller;

import org.hibernate.TransactionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fis.spring.entity.Transaction;
import com.fis.spring.service.TransactionService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	TransactionService service;

	@PostMapping("/transfer")
	public ResponseEntity<?> createTransaction(@RequestBody Transaction transaction) {
		Transaction transaction1 = new Transaction();
		try {
			transaction1 = service.transfer(transaction);
			return new ResponseEntity<>(transaction, HttpStatus.CREATED);
		} catch (TransactionException e) {
			log.error(e.getMessage());
			transaction1 = service.save(transaction);
			return new ResponseEntity<>(transaction, HttpStatus.CREATED);
		}
	}

	@PostMapping("/account/{accountNumber}")
	public ResponseEntity<?> getTransactionsByAccountNumberAndTime(@PathVariable("accountNumber") String accountNumber,
			@RequestParam("create_datatime") String create, @RequestParam("update_datatime") String update) {
		return new ResponseEntity<>(service.findByAccountNumberAndTime(accountNumber, create, update),
				HttpStatus.OK);
	}

	@PostMapping("/report-detail")
	public ResponseEntity<?> getAllByTransactionDateBetween(@RequestParam("create_datatime") String create,
			@RequestParam("update_datatime") String update) {
		return new ResponseEntity<>(service.findAllByDate(create, update), HttpStatus.OK);
	}

}
