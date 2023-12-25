package com.example.demo.io.Io.service;

import org.springframework.stereotype.Service;

import com.example.demo.io.Sv;
import com.example.demo.io.Io.ISv;

@Service
public class SvService {
	
	private ISv isv;
	public SvService(ISv isv) {
		// TODO Auto-generated constructor stub
		this.isv=isv;
		
	}
	public void saveService1() {
		Sv sv=new Sv();
		sv.setCno(14);
		sv.setSname("Divya");
		sv.setSno(13);
		
		
		
		isv.save(sv);
		
	}

}
