package com.fis.spring.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "transactionDate", nullable = false)
	private LocalDateTime transactionDate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fronmAccount",referencedColumnName="id")
	private Account fromAccount;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "toAccount",referencedColumnName="id")
	private Account toAccount;
	
	@Column(name = "amount", nullable = false)
	private Double amount;
	
	@Column(name = "status", nullable = false)
	private Integer status;
	
	@Column(name = "content", nullable = false)
	private String content;
	
	@Column(name = "errorReason", nullable = false)
	private String errorReason;
}
