package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book2;
import com.example.demo.repo.Book2Repo;
@Service
public class Book2ServiceImpl  implements Book2Service{
	@Autowired
	
	private Book2Repo bookRepo;
	
	@Override
	
	public List<Book2>getAllBooks(){
		
		return bookRepo.findAll();
	}
	

}
