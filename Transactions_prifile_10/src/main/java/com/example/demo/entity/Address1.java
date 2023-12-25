package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address1 {
	
	@Id
	private String city;
	private String state;
	private String country;
	private Integer pno;
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public Integer getPno() {
		return pno;
	}


	public void setPno(Integer pno) {
		this.pno = pno;
	}


	public Integer getEid() {
		return eid;
	}


	public void setEid(Integer eid) {
		this.eid = eid;
	}


	public Address1(String city, String state, String country, Integer pno, Integer eid) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.pno = pno;
		this.eid = eid;
	}
	
	public Address1() {
		// TODO Auto-generated constructor stub
	}

}
