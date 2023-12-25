package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.SV;

public interface SVRepo  extends CrudRepository<SV, Integer>{
	
	
	//public List<SV> findBySname(String sname);
	public List<SV> findBySnoAndSname(Integer sno,String sname);
	

}
