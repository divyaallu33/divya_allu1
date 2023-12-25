package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Employee")

public class Employee {
	@Id
	private Integer eno;
	private String ename;
	private Double esal;
	

}
