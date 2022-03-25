package com.fis.spring.springjpa.controller;

import com.fis.spring.springjpa.entity.Account;
import com.fis.spring.springjpa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
