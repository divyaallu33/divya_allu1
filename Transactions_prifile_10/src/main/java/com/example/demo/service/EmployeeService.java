package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address1;
import com.example.demo.entity.Employee1;
import com.example.demo.repo.AddrRepo;
import com.example.demo.repo.Emp1Repo;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	
	@Autowired
	private Emp1Repo empRepo;
	
	@Autowired
	
	private AddrRepo addr1;
	
	@Transactional(rollbackOn = Exception.class)
	public void saveData() {
		
		Employee1 emp=new Employee1();
		
		
		
		emp.setEname("Chinni");
		emp.setEsal(350000.00);
		
	     Employee1 save1 = empRepo.save(emp); 
	     int i=1/0;
		Address1 addr=new Address1();
		addr.setCity("hyd");
		addr.setCountry("India");
		addr.setPno(14);
		addr.setState("Tn");
		addr.setEid(save1.getEid());
		
		  addr1.save(addr);
		  
		  
		  
	}
	

}
