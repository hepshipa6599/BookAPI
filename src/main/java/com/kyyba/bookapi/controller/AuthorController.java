package com.kyyba.bookapi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kyyba.bookapi.request.AuthorRequest;
import com.kyyba.bookapi.response.AuthorResponse;
import com.kyyba.bookapi.service.AuthorService;

@RestController
public class AuthorController {

		@Autowired
		private AuthorService authorService;
		
		@RequestMapping(method = RequestMethod.GET,value="/author")
		public AuthorResponse getauthor(){
			return authorService.getAuthor();
		}
		
		@RequestMapping(method=RequestMethod.POST,value="/author")
		public void addauthor(@RequestBody AuthorRequest author) {
			authorService.addAuthor(author);
			
		}

	}



