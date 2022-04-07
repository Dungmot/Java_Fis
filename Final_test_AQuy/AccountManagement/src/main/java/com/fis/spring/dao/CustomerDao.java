package com.fis.spring.dao;

import java.util.List;

import com.fis.spring.entity.Customer;

public interface CustomerDao {
	List<Customer> getByName(String name);
}
