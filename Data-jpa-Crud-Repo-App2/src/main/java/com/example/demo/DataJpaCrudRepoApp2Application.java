package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.io.Io.service.SvService;

@SpringBootApplication
public class DataJpaCrudRepoApp2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(DataJpaCrudRepoApp2Application.class, args);
		
		SvService sv=run.getBean(SvService.class);
		sv.saveService1();
	}

}
