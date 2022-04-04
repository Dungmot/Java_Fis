package com.fis.finaltest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fis.finaltest.entity.Detective;

@Repository
public interface DetectiveRepo extends JpaRepository<Detective, Long>{

}
