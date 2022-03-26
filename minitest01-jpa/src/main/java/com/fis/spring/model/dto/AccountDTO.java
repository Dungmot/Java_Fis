package com.fis.spring.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    private Long accountId;
    private String accountNumber;
    private String accountName;
    private Double balance;
}

///định nghĩ cấu trúc đại diện cho response
