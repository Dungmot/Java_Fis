package com.fis.spring.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fis.spring.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Long>{
	@Query(value = "SELECT id,accountNumber,customerId,balance,status,create_datatime,update_datatime FROM account WHERE id ", nativeQuery = true,
			countQuery = "SELECT accountNumber,customerId,balance,status,create_datatime,update_datatime FROM products WHERE id ")
	public Account getAccountById(Long id);
}
