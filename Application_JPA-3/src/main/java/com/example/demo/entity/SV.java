package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SV {
	
	@Id
	
	private Integer sno;
	private String sname;
	private Integer cno;
	private String Dept;
	
	public SV() {
		
	}

	public SV(Integer sno, String sname, Integer cno, String dept) {
	
		this.sno = sno;
		this.sname = sname;
		this.cno = cno;
		Dept = dept;
	}

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	@Override
	public String toString() {
		return "SV [sno=" + sno + ", sname=" + sname + ", cno=" + cno + ", Dept=" + Dept + "]";
	}
	
}