package com.fis.wallet.controller;

import com.fis.wallet.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/integration")
public class IntegrationController {

    @Autowired
    IntegrationService integrationService;

    @GetMapping("/getAllAccount")
    @ResponseBody
    public ResponseEntity<?> getAllAccount(){
        //get all account from endpoint/account
        return  ResponseEntity.ok(integrationService.getAllAccount());
    }

}
