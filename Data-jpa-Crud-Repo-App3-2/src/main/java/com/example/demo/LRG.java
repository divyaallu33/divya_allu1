package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LRG {
@Id
private Integer sno;
private String sname;
private Integer phno;
public LRG() {
	// TODO Auto-generated constructor stub
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
public Integer getPhno() {
	return phno;
}
public void setPhno(Integer phno) {
	this.phno = phno;
}


}
