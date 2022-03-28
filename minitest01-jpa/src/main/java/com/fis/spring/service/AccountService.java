package com.fis.spring.service;
import com.fis.spring.entity.Account;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface AccountService {
    //Khai báo method lấy ra list Account kiểu trả về là ListAccount
    Account createAccount(Account account);
    Account updateAccount(Account account);
    String deleteAccount(Long accontId);
    Account findAccountById(Long accountId);
    List<Account> findAllAccount();
}


//Service để xử lý logic
//interface AccountService - để giảm thiểu sự phụ thuộc giữa tầng controller và Service
