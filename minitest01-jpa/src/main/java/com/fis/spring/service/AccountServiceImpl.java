package com.fis.spring.service;

import com.fis.spring.entity.Account;
import com.fis.spring.model.dto.AccountDTO;
import com.fis.spring.model.mapper.AccountMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountServiceImpl implements AccountService{
    //Tạo 1 bảng account động thay cho DB (MySQL đang lỗi)
    private static ArrayList<Account> accounts = new ArrayList<Account>();

    //thêm sẵn dữ liệu ban đầu
    static {
        accounts.add(new Account(1L, "030300003331","Lương Hoài Dung", 1000000.0,0));
        accounts.add(new Account(2L, "030300003332","Lê Lung Linh", 100000.0,1));
        accounts.add(new Account(3L, "030300003333","Chu Lung Linh", 10000000.0,2));

    }

    @Override
    public List<AccountDTO> getListAccount() {
        List<AccountDTO> result = new ArrayList<AccountDTO>();
        for (Account account : accounts){
            result.add(AccountMapper.toAccountDto(account));
        }
        //trả về một mảng accounts
        return result;
    }

    @Override
    public AccountDTO getAccountDto(Long id) {
        for (Account account : accounts){
            if(account.getAccountId()==id){
                return AccountMapper.toAccountDto(account);
            }
        }
        return null;
    }

    @Override
    public AccountDTO getAccountById(Long id) {
        return null;
    }

    @Override
    public Account createAccount(Account account) {
        return null;
    }

    @Override
    public Account updateAccount(Account account) {
        return null;
    }

    @Override
    public Account deleteAccount(Long accontId) {
        return null;
    }
}


/*
 Đánh dấu class bằng @Component
 Class này sẽ được Spring Boot hiểu là một Bean (hoặc dependency)
 Và sẽ được Spring Boot quản lý
 Khi gặp một class được đánh dấu @Component thì nó sẽ tạo ra một instance
 và đưa vào ApplicationContext để quản lý
*/
