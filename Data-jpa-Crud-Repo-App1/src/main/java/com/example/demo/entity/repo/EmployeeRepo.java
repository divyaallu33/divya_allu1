package com.example.demo.entity.repo;


import org.springframework.data.repository.CrudRepository;


import com.example.demo.entity.Employee;

public interface EmployeeRepo  extends CrudRepository<Employee, Integer>{
	

}
