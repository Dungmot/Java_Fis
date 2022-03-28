package com.fis.spring.controller;

import com.fis.spring.entity.Account;
import com.fis.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/findAccountById/{accountId}")
    public ResponseEntity<?> findAccountById(@PathVariable Long accountId){
        //gọi sang Account lấy ra Account rồi trả về cho Client
        Account result = accountService.findAccountById(accountId);
        return ResponseEntity.ok(result);
    }
    @PostMapping("/createAccount")
    @ResponseBody
    public ResponseEntity<?> createAccount(@RequestBody Account account){
        return ResponseEntity.ok(accountService.createAccount(account));
    }
    @GetMapping("/updateAccount")
    @ResponseBody
    public ResponseEntity<?> updateAccount(@RequestBody Account account){
        return ResponseEntity.ok(accountService.updateAccount(account));
    }
    @GetMapping("/deleteAccount/{accountId}")
    @ResponseBody
    public ResponseEntity<?> deleteAccount(@PathVariable Long accountId){
        accountService.deleteAccount(accountId);
        return ResponseEntity.ok("Done!");
    }
    @GetMapping("/findAllAccount")
    @ResponseBody
    public ResponseEntity<?> findAllAccount(){
        return ResponseEntity.ok(accountService.findAllAccount());
    }
}


//Nơi tiếp nhận và xử lý các request
/* @Autowired - Tiêm vào một đối tượng accountService
    @SpringBootApplication sẽ quét trong Context
    và tìm thấy AccountServiceImpl (vì phát hiện có @Component)
    và tiêm một instance của AccountService vào thuộc tính này khi khởi tạo AccountController.
 */

