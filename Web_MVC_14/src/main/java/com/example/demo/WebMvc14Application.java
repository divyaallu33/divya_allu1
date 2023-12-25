package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.BookServiceImpl;

@SpringBootApplication
public class WebMvc14Application {

	public static void main(String[] args) {
		SpringApplication.run(WebMvc14Application.class, args);
		//BookServiceImpl bean = run.getBean(BookServiceImpl.class);
		//bean.saveRecords();
	}

}
