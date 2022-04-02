package com.fis.spring.statistic;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class StatisticRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	public Statistic getStatistic() {
		Query query = (Query) entityManager.createQuery("SELECT COUNT(p.id) FROM products p");
		long productCount = (Long )((javax.persistence.Query) query).getSingleResult();
		
		query = (Query) entityManager.createQuery("SELECT COUNT(c.id) FROM customer c");
		long customerCount = (Long )((javax.persistence.Query) query).getSingleResult();
		
		query = (Query) entityManager.createQuery("SELECT COUNT(o.id) FROM orders o");
		long orderCount = (Long )((javax.persistence.Query) query).getSingleResult();
		
		Statistic statistic = new Statistic();
		statistic.setProductCount(productCount);
		statistic.setCustomerCount(customerCount);
		statistic.setOrderCount(orderCount);
		return statistic;
	}
}
