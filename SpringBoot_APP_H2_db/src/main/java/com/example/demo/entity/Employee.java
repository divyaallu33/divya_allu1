package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Book1_TBL")

public class Employee {
@Id

	
	private Integer eno;
	private String ename;
	
	public Employee() {
		
	}

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Employee(Integer eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	
	
}

