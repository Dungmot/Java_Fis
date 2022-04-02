package com.fis.spring.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import com.fis.spring.customer.Customer;

@Entity
@Table(name="orders")
public class Order {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	private float total;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Order(Integer id, Customer customer, float total) {
		super();
		this.id = id;
		this.customer = customer;
		this.total = total;
	}

	public Order() {
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", total=" + total + "]";
	}
	
	
}
