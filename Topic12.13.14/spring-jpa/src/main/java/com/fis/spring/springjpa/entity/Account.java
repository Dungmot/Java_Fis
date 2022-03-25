package com.fis.spring.springjpa.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="account_id")
    @JsonProperty("account_id")
    private Long accountId;

    @Column(name="account_no")
    @JsonProperty("account_no")
    private String accountNo;

    @Column(name="card_no")
    @JsonProperty("card_no")
    private String cardNo;

    @Column(name="fullname")
    private String fullname;

    @Column(name="amount")
    private Long amount;

    @JsonProperty("issued_date")
    @Column(name="issued_date")
    private Date issuedDate;

    private Date updateDate;
}
