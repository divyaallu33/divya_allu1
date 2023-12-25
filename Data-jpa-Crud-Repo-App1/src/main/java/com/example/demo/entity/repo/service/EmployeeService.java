package com.example.demo.entity.repo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	private EmployeeRepo empRepo;
	
	public EmployeeService(EmployeeRepo empRepo) {
		
		this.empRepo=empRepo;
		
		System.out.println(this.empRepo.getClass().getName());
		
		
		

}
}
