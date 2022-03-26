package com.fis.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Transaction {
    private Long transactionId;
    private Date transactionDate;
    private Number fromAccount;
    private Number toAccount;
    private Double amount;
    private Integer status;
    private String content;
    private String errorReason;
}
