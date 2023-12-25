package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;
	public void saveData() {
		
		
		Employee emp=new Employee();
		emp.setEname("Chinni");
		emp.setEno(111);
		
    empRepo.save(emp);
		
	}
	
	

}
