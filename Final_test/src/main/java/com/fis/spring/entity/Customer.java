package com.fis.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "name", length = 100, nullable = false)
	private String name;
	
	@Column(name = "birthday", nullable = false)
	private Date birthday;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "identityNo", length = 10, nullable = false)
	private String identityNo;
	
	@Column(name = "customerType", nullable = false)
	private String customerType;
	
	@Column(name = "status", nullable = false)
	private Integer status;
	
	@Column(name = "createDatetime", nullable = false)
	private Date createDatetime;
	
	@Column(name = "updateDatetime", nullable = false)
	private Date updateDatetime;
	
}
