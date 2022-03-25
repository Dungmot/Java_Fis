package com.fis.spring.springjpa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fis.spring.springjpa.entity.Account;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
public class AccountDTO extends Account {

    private String address;
    private Date birthday;
}
