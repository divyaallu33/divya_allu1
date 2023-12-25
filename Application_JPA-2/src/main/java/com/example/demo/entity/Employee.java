package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	
	private Integer eno;
	private String ename;
	private Integer esal;
	public Employee() {
		// TODO Auto-generated constructor stub
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
	public Integer getEsal() {
		return esal;
	}
	public void setEsal(Integer esal) {
		this.esal = esal;
	}
	public void save(Employee em) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	

}
