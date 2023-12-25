package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LRG {
@Id
private Integer sno;
private Integer phno;
private String name;
private String clgName;
public Integer getSno() {
	return sno;
}
public void setSno(Integer sno) {
	this.sno = sno;
}
public Integer getPhno() {
	return phno;
}
public void setPhno(Integer phno) {
	this.phno = phno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getClgName() {
	return clgName;
}
public void setClgName(String clgName) {
	this.clgName = clgName;
}

}
