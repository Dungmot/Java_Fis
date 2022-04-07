package com.fis.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fis.spring.entity.Account;
import com.fis.spring.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@PostMapping("/save")
    @ResponseBody
    public ResponseEntity<?> save(@RequestBody Account account){
        return ResponseEntity.ok(accountService.save(account));
    }
    @PostMapping("/update")
    @ResponseBody
    public ResponseEntity<?> update(@RequestBody Account account){
        return ResponseEntity.ok(accountService.save(account));
    }

    @PostMapping("/delete/{accountId}")
    @ResponseBody
    public ResponseEntity<?> delete(@PathVariable Long accountId){
        accountService.deleteById(accountId);
        return ResponseEntity.ok("Done!");
    }

    @PostMapping("/getById/{accountId}")
    @ResponseBody
    public ResponseEntity<?> getById(@PathVariable Long accountId){
        return ResponseEntity.ok(accountService.getById(accountId));
    }

    @PostMapping("/getByFullname/{fullname}")
    @ResponseBody
    public ResponseEntity<?> getByFullname(@PathVariable Long fullname){
        return ResponseEntity.ok(accountService.getById(fullname));
    }

}
