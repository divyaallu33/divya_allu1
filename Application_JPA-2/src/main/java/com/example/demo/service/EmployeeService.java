package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	private EmployeeRepo emp;
	
	public EmployeeService( EmployeeRepo emp) {
		
		this.emp=emp;
	
	

	}
	public void saveMultipleEmployees() {
		
			Employee em1=new Employee();
			
			em1.setEno(102);
			em1.setEname("Divya");
			em1.setEsal(45000);
			
			
Employee em2=new Employee();
			
			em2.setEno(102);
			em2.setEname("Divya");
			em2.setEsal(45000);
			
			List<Employee> empList=Arrays.asList(em1,em2);
			
			emp.saveAll(empList);
		
		
		
		}
	public void saveData() {
		// TODO Auto-generated method stub
		
	}
	
		
	}

