package com.kyyba.bookapi.response;

import java.util.List;

import com.kyyba.bookapi.dto.AuthorDTO;



public class AuthorResponse {
	List<AuthorDTO> authorlist;

	public List<AuthorDTO> getAuthorlist() {
		return authorlist;
	}

	public void setAuthorlist(List<AuthorDTO> authorlist) {
		this.authorlist = authorlist;
	}
	
}
