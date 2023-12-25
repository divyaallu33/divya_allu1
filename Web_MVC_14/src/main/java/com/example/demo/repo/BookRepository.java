package com.example.demo.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{

	List<Book> findAll();
	public List<Book> findByActiveSW(String status);

}
