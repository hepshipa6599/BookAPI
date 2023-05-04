package com.kyyba.bookapi.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyyba.bookapi.app.Author;
import com.kyyba.bookapi.app.Book;
import com.kyyba.bookapi.dto.AuthorDTO;
import com.kyyba.bookapi.dto.BookDTO;
import com.kyyba.bookapi.repos.BookRepos;
import com.kyyba.bookapi.request.BookRequest;
import com.kyyba.bookapi.response.BookResponse;

import jakarta.transaction.Transactional;
@Service
public class BookService {
		@Autowired
		private BookRepos repository;
		@Transactional
		public BookResponse getBook()
		{
//			repository.
			BookResponse response=new  BookResponse();
			List<BookDTO> bookDTOlist=null;
			List<Book> bookDBList = (List<Book>) repository.findAll();
			if (null != bookDBList && !bookDBList.isEmpty()) {
				bookDTOlist = new ArrayList<BookDTO>();
				for (Book book: bookDBList) {
					BookDTO dto = new BookDTO();
					dto.setId(book.getId());
					dto.setName(book.getName());
					dto.setBookPrice(book.getPrice());
					List<AuthorDTO> authorDTOList = new ArrayList<>();
					for (Author author: book.getAuthor()) {
						AuthorDTO authorDTO = new AuthorDTO();
						authorDTO.setBookId(author.getBookid());
						authorDTO.setAuthorName(author.getAuthorName());
						
                    authorDTOList.add(authorDTO);
					}
					dto.setAuthor(authorDTOList);
					bookDTOlist.add(dto);
				}
				response.setBooklist(bookDTOlist);
			}
			return response;
		}
		
		
		public void addBook(BookRequest book) {
			Book addbook=new Book();
			addbook.setId(book.getBookId());
			addbook.setBookName(book.getBookName());
			addbook.setBookPrice(book.getBookPrice());
			
			repository.save(addbook);
			
		}

	}



