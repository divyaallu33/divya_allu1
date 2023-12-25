package com.example.demo.io;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sv {
	@Id
	private Integer sno;
	private String sname;
	private Integer cno;
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
	

}
