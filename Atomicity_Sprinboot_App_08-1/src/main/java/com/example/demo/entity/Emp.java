package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="EMP_TBL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
	
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eid;
	private String ename;
	private Double esal;
//	public String getEname() {
//		return ename;
//	}
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//	public Double getEsal() {
//		return esal;
//	}
//	public void setEsal(Double esal) {
//		this.esal = esal;
//	}
	
	

	
	

}
