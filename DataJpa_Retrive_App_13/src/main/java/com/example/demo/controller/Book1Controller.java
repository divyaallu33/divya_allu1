package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.BOOK2_TBL;
import com.example.demo.repo.Book1Repo;

@Controller
public class Book1Controller {

	@Autowired
	private Book1Repo repo;

	public Book1Controller() {
		System.out.println("running successfully");
	}

	@GetMapping("/welcome")
	public ModelAndView mvn1() {
		ModelAndView mvn = new ModelAndView();
		List<BOOK2_TBL> records = repo.findAll();
		mvn.addObject("data", records);
		mvn.setViewName("index");
		return mvn;

	}
}
