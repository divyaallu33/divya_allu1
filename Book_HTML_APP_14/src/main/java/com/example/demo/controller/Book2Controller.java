package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Book2;
import com.example.demo.service.Book2Service;

@Controller
public class Book2Controller {
	@Autowired
	private Book2Service service;
	
	@GetMapping("/books")
	public ModelAndView getBooks() {
		
		ModelAndView mav=new ModelAndView();
		List<Book2> allBook2s=service.getAllBooks();
		System.out.println("Number of books retrieved: " + allBook2s.size());
	mav.addObject("book", allBook2s);
	mav.setViewName("index");
	return mav;
	}
	

}
