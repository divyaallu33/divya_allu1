package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.io.ApplicationService;

@SpringBootApplication
public class ApplicationJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(ApplicationJpaApplication.class, args);
		ApplicationService bean=run.getBean(ApplicationService.class);
		bean.saveService();
	}

}
