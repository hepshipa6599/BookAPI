package com.kyyba.bookapi.response;

import java.util.List;

import com.kyyba.bookapi.dto.BookDTO;


public class BookResponse {
	List<BookDTO> booklist;

	public List<BookDTO> getBooklist() {
		return booklist;
	}

	public void setBooklist(List<BookDTO> booklist) {
		this.booklist = booklist;
	}
	

		

}
