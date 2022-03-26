package com.fis.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Account {
    private Long accountId;
    private String accountNumber;
    private String accountName;
    private Double balance;
    private Integer status;
}

//nơi lưu trữ các đối tượng Account
