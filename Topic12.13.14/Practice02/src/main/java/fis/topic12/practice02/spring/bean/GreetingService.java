package fis.topic12.practice02.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fis.topic12.practice02.spring.lang.Language;

@Service
public class GreetingService {

	@Autowired
	private Language language;

	public GreetingService() {

	}

	   public void sayGreeting() {
	       
	       String greeting = language.getGreeting();

	       System.out.println("Greeting: " + greeting);
	   }
}

//@Service - là một annotation, Nó được dùng để xử lý các nghiệp vụ của ứng dụng
//Autowired-được chú thích trên một trường (field) nói với Spring hãy tiêm (inject-gán giá trị) giá trị vào trường đó.