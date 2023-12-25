package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repo.BookRepository;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepo;

	@Override
	public List<Book> getAllBooks() {
		
//		return bookRepo.findAll() ;
		return bookRepo.findByActiveSW("Y");
	}
@Override

public boolean saveBook(Book book) {
	
	book.setActiveSW("Y");
	Book saveBook=bookRepo.save(book);
	if(saveBook.getBookId()!=null) {
		
		return true;
	}
         return false;   
}
@Override

public void deleteBook(Integer bookId) {
//	This is hard delete
//	bookRepo.deleteById(bookId);
	
//	This is soft delete
	Optional<Book> findById = bookRepo.findById(bookId);
	if(findById.isPresent()) {
		Book book=findById.get();
		book.setActiveSW("N");
		bookRepo.save(book);
	}
}
@Override
public Book getBookId(Integer bookId) {
	Optional<Book> findById = bookRepo.findById(bookId);
	if(findById.isPresent()) {
		return findById.get();
	}
	
	return  null;
			
}

}
