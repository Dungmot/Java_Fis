package com.fis.wallet.service.impl;

import com.fis.wallet.dto.AccountDTO;
import com.fis.wallet.service.IntegrationService;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class IntegrationServiceImpl implements IntegrationService {

    @Override
    public Object getAllAccount() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:7888/account/getByFullname/Dung mot";
        AccountWrapper lst = restTemplate.getForObject(url, AccountWrapper.class);
        return lst.getLstAccount();
    }
    @Data
    class AccountWrapper{
        List<AccountDTO> lstAccount;
        }
        //trả về kiểu list
//        AccountDTO[] arr= restTemplate.getForObject(url, AccountDTO[].class);
//        List<AccountDTO> lst = Arrays.asList(arr);
//        return lst;

        //Trả về kiểu Object
//        Object o= restTemplate.getForObject(url, Object.class);
//        return o;


    }




