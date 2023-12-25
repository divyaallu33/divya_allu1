package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.EmployeeService;

@SpringBootApplication
public class TransactionsPrifile10Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = 
				SpringApplication.run(TransactionsPrifile10Application.class, args);
		EmployeeService bean = run.getBean(EmployeeService.class);
		
		bean.saveData();
		
	}

}
