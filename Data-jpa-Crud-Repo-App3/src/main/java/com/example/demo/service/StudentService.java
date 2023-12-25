package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService  {
	private  StudentRepo stdrepo;
	public StudentService(StudentRepo stdrepo) {
		
		this.stdrepo=stdrepo;
		
		
		
	}
	
	

}
