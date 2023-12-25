package com.example.demo.come;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	public WelcomeController() {
		System.out.println("Welcome controller: consructor");
		
	}
	@GetMapping("/welcome")
	@RequestMapping
		public  ModelAndView getWelcomeMsg() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg1","Hello Chinni");
		
		mav.addObject("msg2","VERY GOOD MORNINIG");
		mav.setViewName("index");
		return mav;	
		
	}
@GetMapping("/date")
public ModelAndView getDate() {
	ModelAndView mav=new ModelAndView();
	mav.addObject("date",new Date());
	mav.setViewName("index");
	return mav;
	
	
	
}
}
