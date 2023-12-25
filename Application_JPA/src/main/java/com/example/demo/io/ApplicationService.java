package com.example.demo.io;

import org.springframework.stereotype.Service;

import com.example.demo.ILRG;
import com.example.demo.LRG;

@Service
public class ApplicationService {
private ILRG lrg;
public ApplicationService(ILRG lrg) {
	// TODO Auto-generated constructor stub
	this.lrg=lrg;
}
public void saveService() {
	LRG lr=new LRG();
	lr.setClgName("nalnda");
	lr.setName("Divya");
	lr.setPhno(123456);
	lr.setSno(101);
	lrg.save(lr);
	
}
}
