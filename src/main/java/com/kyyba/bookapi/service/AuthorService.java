package com.kyyba.bookapi.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kyyba.bookapi.app.Author;
import com.kyyba.bookapi.dto.AuthorDTO;
import com.kyyba.bookapi.repos.AuthorRepos;
import com.kyyba.bookapi.request.AuthorRequest;
import com.kyyba.bookapi.response.AuthorResponse;

import jakarta.transaction.Transactional;
@Service
public class AuthorService {
	
		@Autowired
		private AuthorRepos repository;
		
		@Transactional
		public AuthorResponse getAuthor() {
			
			AuthorResponse response=new  AuthorResponse();
			List<AuthorDTO> authorDTOlist=null;
			List<Author> bookAuthorDBList = (List<Author>) repository.findAll();
			if (null != bookAuthorDBList && !bookAuthorDBList.isEmpty()) {
				authorDTOlist = new ArrayList<AuthorDTO>();
				for (Author bookAuthor: bookAuthorDBList) {
					
					AuthorDTO dto = new AuthorDTO();
					
					dto.setBookId(bookAuthor.getBookid());
					dto.setAuthorName(bookAuthor.getAuthorName());
					authorDTOlist.add(dto);
					
									}
				
				response.setAuthorlist(authorDTOlist);
			}
			return response;	
		}

		public void addAuthor(AuthorRequest author) {
			
			Author bookAuthor= new Author();
			
			bookAuthor.setBookId(author.getBookId());
			bookAuthor.setAuthorName(author.getAuthorName());
			
			repository.save(bookAuthor);
		}

	}



