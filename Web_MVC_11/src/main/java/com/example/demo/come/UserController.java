package com.example.demo.come;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	public UserController() {
		System.out.println("User Login Program");
	}
@GetMapping("/chinni")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg1","Welcome to UserController");
		mav.addObject("msg2","UserLoginController is sucessfull");
		mav.setViewName("index");
		return mav;
		
	}
}
