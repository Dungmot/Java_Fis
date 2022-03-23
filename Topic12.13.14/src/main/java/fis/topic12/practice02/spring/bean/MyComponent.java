package fis.topic12.practice02.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

	@Autowired
	private MyRepository repository;
	
	public void showAppInfo() {
        System.out.println("Now is: "+ repository.getSystemDateTime());
        System.out.println("App Name: "+ repository.getAppName());
    }
}

//@Component-là để tạo ra một bean (class MyComponent-đánh dấu @Component -> Spring khi đọc qua class này sẽ tạo 1 Bean tên MyComponent trong Container của nó)
//Không có sự khác biệt về cách sử dụng của @Service, @Component và @Repository
//bạn sử dụng để chú thích trên các class của bạn nên phù hợp với ý nghĩa và ngữ cảnh trong ứng dụng.