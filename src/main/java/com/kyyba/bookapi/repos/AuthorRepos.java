package com.kyyba.bookapi.repos;

import org.springframework.data.repository.CrudRepository;

import com.kyyba.bookapi.app.Author;

public interface AuthorRepos extends  CrudRepository<Author, Integer>{

	}



