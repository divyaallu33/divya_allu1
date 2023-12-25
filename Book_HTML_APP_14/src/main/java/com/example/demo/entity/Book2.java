package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BOOK2_TBL")
public class Book2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bookId", nullable=false,unique=true,columnDefinition="INTEGER AUTO_INCREMENT")
	private Integer bookId;
	private String bookName;
	private Double Price;
	private String author;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book2(Integer bookId, String bookName, Double price, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		Price = price;
		this.author = author;
	}
	
	public Book2() {
		// TODO Auto-generated constructor stub
	}
}
