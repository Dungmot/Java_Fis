package com.fis.wallet.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class AccountDTO {
    @JsonProperty("account_id")
    private Long accountId;

    @JsonProperty("account_no")
    private String accountNo;

    @JsonProperty("card_no")
    private String cardNo;

    private String fullname;

    private Long amount;

    @JsonProperty("issued_date")
    private Date issuedDate;

    @JsonProperty("update_date")
    private Date updateDateDate;
}
