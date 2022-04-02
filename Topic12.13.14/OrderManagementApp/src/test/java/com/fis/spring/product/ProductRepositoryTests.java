package com.fis.spring.product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class ProductRepositoryTests {
	@Autowired
	private ProductRepository repo;
	
	@Test
	public void testListAll() {
		List<Product> listProducts = repo.findAll();
		listProducts.forEach(System.out::println);
	}
	
	@Test
	public void testGetProductsMaxPrice() {
		Integer maxPrice = 700;
		Pageable pageable = PageRequest.of(1, 5);
		List<Product> listProducts = repo.getProductsWithMaxPrice(maxPrice, pageable);
		listProducts.forEach(System.out::println);
	}
	
	@Test
	public void testUpdatePrice() {
		Integer amount = 2;
		repo.updatePrice(amount);
	}
}
