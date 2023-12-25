package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	
		@Autowired
		private EmployeeRepository empRepo;
		
		@Override
		
		public List<Employee> getAllEmployees(){
		
		return empRepo.findAll();
		
	}

}
