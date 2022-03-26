package com.fis.spring.service;
import com.fis.spring.entity.Account;
import com.fis.spring.model.dto.AccountDTO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface AccountService {
    //Khai báo method lấy ra list Account kiểu trả về là ListAccount
    public List<AccountDTO> getListAccount();
    public AccountDTO getAccountDto(Long id);
    public AccountDTO getAccountById(Long id);
    Account createAccount(Account account);
    Account updateAccount(Account account);
    Account deleteAccount(Long accontId);

}


//Service để xử lý logic
//interface AccountService - để giảm thiểu sự phụ thuộc giữa tầng controller và Service
