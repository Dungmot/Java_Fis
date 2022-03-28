package com.fis.spring.controller;

import com.fis.spring.entity.Transaction;
import com.fis.spring.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @PostMapping("")
    @ResponseBody
    public ResponseEntity<?> transaction(@RequestBody Transaction transaction){
        return ResponseEntity.ok(transactionService.transaction(transaction));
    }

}
