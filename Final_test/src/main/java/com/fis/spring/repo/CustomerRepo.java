package com.fis.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.spring.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
