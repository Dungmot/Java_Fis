package com.fis.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface TransactionRepo extends JpaRepository<Transactional, Long>{

}
