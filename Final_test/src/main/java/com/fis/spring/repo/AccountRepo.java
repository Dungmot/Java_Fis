package com.fis.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fis.spring.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Long>{
}
