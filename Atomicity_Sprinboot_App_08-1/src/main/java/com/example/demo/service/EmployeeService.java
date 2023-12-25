package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AddrRepo;
import com.example.demo.entity.Address;
import com.example.demo.entity.Emp;
import com.example.demo.repo.EmpRepo;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
@Autowired
	private EmpRepo empRepo;
@Autowired
	private AddrRepo addrRepo;
	
	

	
	@Transactional(rollbackOn =Exception.class)
	public void saveData(){
		
	
	Emp emp =new Emp();
	emp.setEname("John");
	emp.setEname(15000.00);
	
	Emp savedEntity= empRepo.save(emp);
	
	Address addr=new Address(77, "hyd", "telangana", "india", "permanent",1);
	
	
	
	addrRepo.save(addr);
	 
	
	}



	
	

}