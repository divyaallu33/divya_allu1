package com.example.demo.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.entity.BookPk;
import com.example.demo.repository.BookRepo;

@Service

public class BookService {
	
	@Autowired
	
	private BookRepo repo;
	public void saveBook() {
		BookPk pk=new BookPk(101, "java");
		

		Book entity=new Book(1000.00, "james", pk);
	
		repo.save(entity);
		
		System.out.println("Record saved..");
	}
//	public  void getBook() {
//		Book Pk=new BookPk(101,"java");
//		Optional<Book> findById=repo.findById(pk);
//		if(findById.isPresent()) {
//			System.out.println(findById.get());
//		}
	
		
	}


