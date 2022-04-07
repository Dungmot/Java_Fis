package com.fis.spring.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "accountNumber", length = 13, nullable = false)
	private String accountNumber;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerId",referencedColumnName="id")
	private Account customerId;
	
	@Column(name = "balance", nullable = false)
	private Double balance;
	
	@Column(name = "status", nullable = false)
	private Integer status;
	
	@Column(name = "create_datatime", nullable = false)
	private Date create_datatime;
	
	@Column(name = "update_datatime", nullable = false)
	private Date update_datatime;
}
