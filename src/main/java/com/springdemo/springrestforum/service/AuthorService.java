package com.springdemo.springrestforum.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.springrestforum.model.Author;
import com.springdemo.springrestforum.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	public List<Author> getAll(){
		return authorRepository.findAll();
	}
	
	public Author findById(int id) {
		return authorRepository.findById(id).orElse(new Author());
	}
	
	public Author add(Author author) {
		System.out.println(author.getFirstName() + " " + author.getLastName());
		authorRepository.save(author);
		return author;
	}
	
	public Author update(Author author) {
		Author authorExisting = this.findById(author.getId());
		authorExisting.setFirstName(author.getFirstName());
		authorExisting.setLastName(author.getLastName());
		authorRepository.save(authorExisting);
		return authorExisting;
	}
	
	public void delete(int id) {
		authorRepository.deleteById(id);
	}
	
}
