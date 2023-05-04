package com.kyyba.bookapi.request;

import java.util.List;

import com.kyyba.bookapi.app.Book;

public class AuthorRequest {
	private int bookId;
	private String authorName;
	
	
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	

}
