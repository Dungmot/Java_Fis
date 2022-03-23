package fis.topic12.practice02.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fis.topic12.practice02.spring.bean.GreetingService;
import fis.topic12.practice02.spring.bean.MyComponent;
import fis.topic12.practice02.spring.config.AppConfiguration;
import fis.topic12.practice02.spring.lang.Language;

public class MainProgram {
	public static void main(String[] args) {
		//Tạo ra 1 đối tượng ApplicationContext bằng cách đọc cấu hình trong class AppConfiguration
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		System.out.println("---------");
		Language language = (Language) context.getBean("language");
		System.out.println("Bean Language: " +language);
		System.out.println("Call language.sayBye(): "+ language.getBye());
		
		System.out.println("---------");
		
		GreetingService service = (GreetingService) context.getBean("greetingService");
		service.sayGreeting();
		System.out.println("---------");
		MyComponent myComponent = (MyComponent) context.getBean("myComponent");
		myComponent.showAppInfo();
	}
}
