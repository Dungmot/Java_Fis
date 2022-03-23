package fis.topic12.practice02.spring.config;

import fis.topic12.practice02.spring.lang.Language;
import fis.topic12.practice02.spring.lang.impl.Vietnamese;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration												
@ComponentScan({"fis.topic12.practice02.spring.bean"})		 
public class AppConfiguration {

	@Bean(name ="language")
    public Language getLanguage() {

        return new Vietnamese();
    }
}

//@Configuration - chỉ ra class khai báo sử dụng Annotation @Configuration khai báo một hoặc nhiều @Bean method trong class đó.
//@ComponentScan - thông báo có Spring Container biết phải vào package nào trong dự án để quét

//Method (phương thức) sử dụng @Bean ở phía trên sản xuất ra đối tượng bean và được quản lý bởi Spring Container.
//Bean Annotation có thể sử dụng với các tham số như name, initMethod hoặc destroyMethod.

//Ví dụ dưới đây tôi sử dụng @Bean để tạo ra object getLanguage() kiểu Language