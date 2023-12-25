package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BOOK2_TBL;
import com.example.demo.repo.Book1Repo;

@Service
public class Book1Service {
	@Autowired
	private Book1Repo bookRepo;
	
		
	

	public List<BOOK2_TBL> getAllBook1s() {
		return bookRepo.findAll();

	}

}