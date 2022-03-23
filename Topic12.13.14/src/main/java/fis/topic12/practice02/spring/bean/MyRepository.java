package fis.topic12.practice02.spring.bean;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public String getAppName() {
        return "Hello Spring App";
    }

    public Date getSystemDateTime() {
        return new Date();
    }
}

//@Repository-để nói Bean này dùng để truy cập và thao tác xuống cơ sở dữ liệu