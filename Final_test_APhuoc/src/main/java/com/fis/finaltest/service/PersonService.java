package com.fis.finaltest.service;

import org.springframework.stereotype.Service;

import com.fis.finaltest.entity.Person;

@Service
public interface PersonService {

	Person findById(Long id);
}
