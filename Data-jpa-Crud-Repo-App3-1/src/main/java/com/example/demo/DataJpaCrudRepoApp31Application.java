package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaCrudRepoApp31Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(DataJpaCrudRepoApp31Application.class, args);
		
		Student1Service bean=run.getBean(Student1Service.class);
		bean.saveService();
	}

}
