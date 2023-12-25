package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.Book2Service;

@SpringBootApplication
public class BookHtmlApp14Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BookHtmlApp14Application.class, args);
		run.getBean(Book2Service.class);
		
	}

}
