package com.fis.finaltest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fis.finaltest.entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long>{

}
