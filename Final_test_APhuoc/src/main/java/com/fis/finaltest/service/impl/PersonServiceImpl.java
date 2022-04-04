package com.fis.finaltest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.finaltest.entity.Person;
import com.fis.finaltest.repo.PersonRepo;
import com.fis.finaltest.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepo personRepo;

	@Override
	public Person findById(Long id) {
		return personRepo.findById(id).orElse(null);
	}

}
