package com.fis.spring.repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.fis.spring.entity.Account;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase
@Rollback(false)
public class AccountRepositoryTests {
	@Autowired
	private AccountRepo repo;
	
	@Test
	public void testListAll() {
		List<Account> listProducts = repo.findAll();
		listProducts.forEach(System.out::println);
	}
	
	@Test
	public void testGetAccountById() {
		Integer id = 1;
		Account account = repo.getAccountById(id);
		account.forEach(System.out::println);
	}

}
