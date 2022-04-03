package com.fis.spring.service;

import java.util.List;

import com.fis.spring.entity.Customer;

public interface CustomerService {
	Customer save(Customer account);

	Customer upDate(Customer account);

	void deleteById(Long accontId);

	Customer getById(Long accontId);

	List<Customer> getByName(String name);
}
