package com.fis.spring.springjpa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name="account_detail")
public class AccountDetail {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "account_no")
    private String accountNo;

    @Column(name = "address")
    private String address;

    @Column(name = "birthday")
    private Date birthday;
}
