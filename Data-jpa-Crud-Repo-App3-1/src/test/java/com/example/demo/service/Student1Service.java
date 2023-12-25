package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student1;
import com.example.demo.repository.Student1Repo;

@Service
public class Student1Service {
	
	private Student1Repo std1repo;
	
	public Student1Service(Student1Repo std1repo) {
		// TODO Auto-generated constructor stub
		this.std1repo=std1repo;
		
	}
	public void saveService() {
		Student1 st=new Student1();
		st.setCno(14);
		st.setSname("Chinni");
		st.setSno(246);
		std1repo.save(st);
	}

}
