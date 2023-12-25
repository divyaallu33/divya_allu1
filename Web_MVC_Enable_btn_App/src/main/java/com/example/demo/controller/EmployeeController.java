	package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	
@GetMapping("/Employees")
public ModelAndView getEmps() {

	ModelAndView mav=new ModelAndView();
	List<Employee> allEmployees = empService.getAllEmployees();
	
	mav.addObject("Employees", allEmployees);
	mav.setViewName("EmployeeViews");
	return mav;
	
}
}
