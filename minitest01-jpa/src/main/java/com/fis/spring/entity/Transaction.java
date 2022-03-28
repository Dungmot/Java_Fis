package com.fis.spring.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Data
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long transactionId;

    private Date transactionDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fromAccount", referencedColumnName = "accountId")
    private Account fromAccount;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "toAccount", referencedColumnName = "accountId")
    private Account toAccount;

    private Double amount;

    private Integer status;

    private String content;

    private String errorReason;

}
