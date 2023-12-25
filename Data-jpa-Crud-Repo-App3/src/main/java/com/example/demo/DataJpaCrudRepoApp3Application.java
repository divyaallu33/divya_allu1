package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaCrudRepoApp3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(DataJpaCrudRepoApp3Application.class, args);
		StudentService bean=run.getBean(StudentService.class);
		bean.saveStudent();
	}

}
