package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
	
	private StudentRepo stdRepo;
	public StudentService(StudentRepo stdRepo) {
		// TODO Auto-generated constructor stub
		this.stdRepo=stdRepo;
	}
		public void saveStudent() {
			Student std=new Student();
			std.setDept("Maths");
		     std.setSname("Chinni");
		     std.setSno(14);
		     
		     (stdRepo).save(std);
	}

}
