package com.fis.spring.service.ipml;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fis.spring.dao.CustomerDao;
import com.fis.spring.entity.Customer;
import com.fis.spring.repo.CustomerRepo;
import com.fis.spring.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo customerRepo;

	@Autowired
	CustomerDao customerDao;

	@Override
	public Customer save(Customer customer) {
		customer.setCreateDatetime(new Date());
		return customerRepo.save(customer);
	}

	@Override
	public Customer upDate(Customer customer) {
		customer.setUpdateDatetime(new Date());
		Customer customer1 = customerRepo.save(customer);
		return customer1;
	}

	@Override
	public void deleteById(Long customerId) {
		customerRepo.deleteById(customerId);

	}

	@Override
	public Customer getById(Long customerId) {
		return customerRepo.findById(customerId).orElse(null);
	}

	@Override
	public List<Customer> getByName(String name) {
		return customerDao.getByName(name);
	}

}
