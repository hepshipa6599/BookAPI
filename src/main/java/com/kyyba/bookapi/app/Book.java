package com.kyyba.bookapi.app;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	@Id
	@Column(name="book_id")
	private int bookid;
	@Column(name="book_name")
	private String name;
	@Column(name="bookprice")
	private int price;
     public int getId() {
		return bookid;
	}
   public void setId(int Id) {
		this.bookid = Id;
	}
    public String getName() {
		return name;
	}

public void setBookName(String Name) {
		this.name = Name;
	}

	public int getPrice() {
		return price;
	}

	public void setBookPrice(int Price) {
		this.price = Price;
	}

    public List<Author> getAuthor() {
		return author;
	}
	public void setAuthor(List<Author> author) {
		this.author = author;
	}

	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "bookid",fetch = FetchType.LAZY)
	private List<Author> author;
	
	

}
