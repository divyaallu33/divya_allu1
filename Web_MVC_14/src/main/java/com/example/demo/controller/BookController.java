package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService service;
	
	@GetMapping("/index")
	
	public ModelAndView index() {
	ModelAndView mav=new ModelAndView();
	
	mav.addObject("book", new Book());
	mav.setViewName("index");
	return mav;
	
	}
	@GetMapping("/edit")
	public ModelAndView editBook(@RequestParam("bookId") Integer bookId) {
		Book bookobj=service.getBookId(bookId);
		ModelAndView mav=new ModelAndView();

		mav.addObject("book", bookobj);
		mav.setViewName("index");
		return mav;
	}
	@PostMapping("/book")
	public ModelAndView saveBook(Book book) {
		
		ModelAndView mav=new ModelAndView();
		boolean status=service.saveBook(book);
		if(status)
		{
			mav.addObject("sucsMsg", "Book Saved");
		}
		else {
			mav.addObject("errMsg", "Failed to save");
		}
		mav.setViewName("index");
		return mav;
		}
	@GetMapping("/books")
	public ModelAndView getBooks() {
		
		ModelAndView mav=new ModelAndView();
		
		List<Book> allBooks = service.getAllBooks();
		
		mav.addObject("books", allBooks);
		mav.setViewName("booksView");	
      return mav;
	}
	@GetMapping("/delete")
	public ModelAndView deleteBook(@RequestParam("bookId") Integer bookId){
		
		service.deleteBook(bookId);
        ModelAndView mav=new ModelAndView();
		List<Book> allBooks = service.getAllBooks();
		mav.addObject("books", allBooks);
		mav.setViewName("booksView");  
		return mav;
	}
	
}

