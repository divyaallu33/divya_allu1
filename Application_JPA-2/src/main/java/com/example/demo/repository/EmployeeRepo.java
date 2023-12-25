package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
	
	
	@Query(value="select* from employee",nativeQuery=true)
	public List<Employee> getAllEmpRecords();

}
