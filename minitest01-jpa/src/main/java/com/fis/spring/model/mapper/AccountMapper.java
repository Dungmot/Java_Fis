package com.fis.spring.model.mapper;

import com.fis.spring.entity.Account;
import com.fis.spring.model.dto.AccountDTO;

public class AccountMapper {
    public static AccountDTO toAccountDto(Account account){
        AccountDTO tmp = new AccountDTO();
        tmp.setAccountId(account.getAccountId());
        tmp.setAccountName(account.getAccountName());
        tmp.setAccountNumber(account.getAccountNumber());
        tmp.setBalance(account.getBalance());
        return tmp;
    }
}


/*Hàm convert các dữ liệu từ Account sang AccountDTO
    mục đích để tái sử dụng code
 */