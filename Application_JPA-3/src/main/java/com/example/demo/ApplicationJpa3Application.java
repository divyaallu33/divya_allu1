package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.EmployeeService;
import com.example.demo.service.SVService;

@SpringBootApplication
public class ApplicationJpa3Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(ApplicationJpa3Application.class, args);

	SVService bean = context.getBean(SVService.class);
	bean.getfindBysnoAndName("Divya");
	}

}
