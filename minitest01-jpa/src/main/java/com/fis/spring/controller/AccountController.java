package com.fis.spring.controller;

import com.fis.spring.entity.Account;
import com.fis.spring.model.dto.AccountDTO;
import com.fis.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("")
    public ResponseEntity<?> getListAccount(){
        //gọi sang AccountService lấy ra ListAccount rồi trả về cho Client
        List<AccountDTO> accounts = accountService.getListAccount();
        return ResponseEntity.ok(accounts);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getAccountById(@PathVariable Long id){
        //gọi sang AccountService lấy ra ListAccount rồi trả về cho Client
        AccountDTO result = accountService.getAccountById(id);
        return ResponseEntity.ok(result);
    }
    @PostMapping("")
    @ResponseBody
    public ResponseEntity<?> createAccount(@RequestBody Account account){
        return ResponseEntity.ok(accountService.createAccount(account));
    }
    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<?> updateAccount(@RequestBody Account account){
        return ResponseEntity.ok(accountService.updateAccount(account));
    }
    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<?> deleteAccount(@PathVariable Long accountId){
        accountService.deleteAccount(accountId);
        return ResponseEntity.ok("Done!");
    }
}


//Nơi tiếp nhận và xử lý các request
/* @Autowired - Tiêm vào một đối tượng accountService
    @SpringBootApplication sẽ quét trong Context
    và tìm thấy AccountServiceImpl (vì phát hiện có @Component)
    và tiêm một instance của AccountService vào thuộc tính này khi khởi tạo AccountController.
 */

