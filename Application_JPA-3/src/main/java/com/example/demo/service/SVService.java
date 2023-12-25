package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SV;
import com.example.demo.repository.SVRepo;

@Service
public class SVService {
	@Autowired
	private SVRepo srepo;

	public void getfindBysnoAndName(String sname) {

//		List<SV> findByName = srepo.findBySname(sname);
//		findByName.forEach(System.out::println);
		List<SV> findBySnoAndSname=srepo.findBySnoAndSname(null, sname);
		findBySnoAndSname.forEach(System.out::println);
	}

}
