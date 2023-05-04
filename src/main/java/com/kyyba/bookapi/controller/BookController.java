package com.kyyba.bookapi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kyyba.bookapi.request.BookRequest;
import com.kyyba.bookapi.response.BookResponse;
import com.kyyba.bookapi.service.BookService;

@RestController
public class BookController {
		@Autowired
		private BookService bookService;
		
		@RequestMapping(method = RequestMethod.GET,value="/book")
		public BookResponse getbook(){
			return 	 bookService.getBook();	
		}
		
		@RequestMapping(method=RequestMethod.POST,value="/book")
		public void addBook(@RequestBody BookRequest request) {
			bookService.addBook(request);
		}
	}



