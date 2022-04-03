package com.fis.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fis.spring.entity.Customer;
import com.fis.spring.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/save")
    @ResponseBody
    public ResponseEntity<?> save(@RequestBody Customer customer){
        return ResponseEntity.ok(customerService.save(customer));
    }
    @PostMapping("/update")
    @ResponseBody
    public ResponseEntity<?> update(@RequestBody Customer customer){
        return ResponseEntity.ok(customerService.save(customer));
    }

    @PostMapping("/delete/{accountId}")
    @ResponseBody
    public ResponseEntity<?> delete(@PathVariable Long customerId){
    	customerService.deleteById(customerId);
        return ResponseEntity.ok("Done!");
    }

    @PostMapping("/getById/{accountId}")
    @ResponseBody
    public ResponseEntity<?> getById(@PathVariable Long customerId){
        return ResponseEntity.ok(customerService.getById(customerId));
    }

    @PostMapping("/getByFullname/{fullname}")
    @ResponseBody
    public ResponseEntity<?> getByName(@PathVariable Long name){
        return ResponseEntity.ok(customerService.getById(name));
    }
}
