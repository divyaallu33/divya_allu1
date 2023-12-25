package com.example.demo.service;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class EmployeeService {

	@Autowired
	 
	private  EmployeeRepo empRepo;
	
	public void generateExcel(HttpServletResponse response) {
		
	List<Employee> employee = empRepo.findAll();
	
	HSSFWorkbook workbook= new HSSFWorkbook();
  HSSFSheet sheet = workbook.createSheet("Employee Info");
	HSSFRow row = sheet.createRow(0);
	
	row.createCell(0).setCellValue("eno");
	
	
	int dataRowIndex=1;
	
	for(Employee employee1:employee){
	=heet.createRow(dataRowIndex);

	}
			
	
	
	}
}
