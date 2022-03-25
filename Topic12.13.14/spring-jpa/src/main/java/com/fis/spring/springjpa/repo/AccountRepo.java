package com.fis.spring.springjpa.repo;

import com.fis.spring.springjpa.dao.AccountDao;
import com.fis.spring.springjpa.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Long>, AccountDao {

}
