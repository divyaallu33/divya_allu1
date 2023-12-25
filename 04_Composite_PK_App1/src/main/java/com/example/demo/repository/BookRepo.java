package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Book;
import com.example.demo.entity.BookPk;

public interface BookRepo  extends JpaRepository<Book, BookPk>{

	

}
