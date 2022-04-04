package com.fis.finaltest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fis.finaltest.entity.Evidence;

@Repository
public interface EvidenceRepo extends JpaRepository<Evidence, Long>{

}
