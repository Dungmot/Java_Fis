package com.fis.spring.product;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query(value = "SELECT id,name,price FROM products WHERE price < :maxPrice", nativeQuery = true,
			countQuery = "SELECT id,name,price FROM products WHERE price < :maxPrice")
	public List<Product> getProductsWithMaxPrice(Integer maxPrice, Pageable pageable);
	
	@Query(value = "UPDATE products SET price = price + :amount", nativeQuery = true)
	@Modifying
	public void updatePrice(Integer amount);
}
