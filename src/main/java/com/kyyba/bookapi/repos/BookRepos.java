package com.kyyba.bookapi.repos;
import org.springframework.data.repository.CrudRepository;

import com.kyyba.bookapi.app.Book;

	public interface BookRepos  extends CrudRepository<Book, Integer>{ 

	}


