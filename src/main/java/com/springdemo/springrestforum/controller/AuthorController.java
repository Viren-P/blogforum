package com.springdemo.springrestforum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.springrestforum.model.Author;
import com.springdemo.springrestforum.service.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	AuthorService authorService;
	
	@GetMapping(path="/author")
	public List<Author> getAllAuthors() {
		return authorService.getAll();
	}
	
	@GetMapping(path="/author/{id}")
	public Author getAuthor(@PathVariable("id") int id) {
		return authorService.findById(id);
	}
	
	@PostMapping(path="/author/add")
	public Author addAuthor(@RequestBody Author author){
		return authorService.add(author);
	}
	
	@PutMapping(path="/author/update")
	public Author updateAuthor(@RequestBody Author author) {
		return authorService.update(author);
	}
	
	@DeleteMapping(path="/author/delete/{id}")
	public void deleteAuthor(@PathVariable("id") int id) {
		authorService.delete(id);
	}
	
	
}
