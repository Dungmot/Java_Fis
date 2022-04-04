package com.fis.finaltest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fis.finaltest.entity.CriminalCase;

@Repository
public interface CriminalCaseRepo extends JpaRepository<CriminalCase, Long>{

}
