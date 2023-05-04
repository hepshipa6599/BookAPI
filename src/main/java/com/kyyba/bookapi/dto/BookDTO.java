package com.kyyba.bookapi.dto;

import java.util.List;


public class BookDTO {
	private int id;
	private String Name;
	private int Price;
	private List<AuthorDTO> author;
	
	public BookDTO() {
		}

	public int getId() {
		return id;
	}

	public void setId(int Id) {
		this.id = Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getBookPrice() {
		return Price;
	}

	public void setBookPrice(int bookPrice) {
		this.Price = bookPrice;
	}

	public List<AuthorDTO> getAuthor() {
		return author;
	}

	public void setAuthor(List<AuthorDTO> author) {
		this.author = author;
	}
	
	}
