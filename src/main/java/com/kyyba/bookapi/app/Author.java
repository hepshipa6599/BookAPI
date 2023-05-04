package com.kyyba.bookapi.app;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="author")
public class Author 
{
	@Id
	private int sNo;
	@Column(name="book_id")
    private int bookid;
	@Column(name="authorname")
    private String authorName;
	
	public Author() {
		
	}
	
	public int getBookid() {
		return bookid;
	}
	public void setBookId(int bookid) {
		this.bookid = bookid;
	}
	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}




	@ManyToOne(fetch=FetchType.LAZY)
	@JsonManagedReference
	@JoinColumn(name="book_id", referencedColumnName = "book_id", insertable=false, updatable=false)
	private Book book;
	
}
