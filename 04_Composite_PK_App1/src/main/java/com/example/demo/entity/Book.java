package com.example.demo.entity;
Chinni
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="BOOK_iNFO_TBL")
public class Book {
	

	private Double bookPrice;
	private String authorName;
	@EmbeddedId
	private BookPk bookPk;
	public Book() {
		
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public BookPk getBookPk() {
		return bookPk;
	}
	public void setBookPk(BookPk bookPk) {
		this.bookPk = bookPk;
	}
	public Book(Double bookPrice, String authorName, BookPk bookPk) {
		super();
		this.bookPrice = bookPrice;
		this.authorName = authorName;
		this.bookPk = bookPk;
	}
	
	

}
