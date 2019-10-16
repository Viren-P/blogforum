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
import com.springdemo.springrestforum.model.Post;
import com.springdemo.springrestforum.service.AuthorService;
import com.springdemo.springrestforum.service.CategoryService;
import com.springdemo.springrestforum.service.PostService;

@RestController
public class PostController {

	@Autowired
	PostService postService;
	@Autowired
	AuthorService authorService;
	@Autowired
	CategoryService categoryService;
	
	@GetMapping(path="/post")
	public List<Post> getAll(){
		return postService.getAll();
	}
	
	@GetMapping(path="/post/{id}")
	public Post getById(@PathVariable("id") int id) {
		return postService.getById(id);
	}
	
	@PutMapping(path="/post/update")
	public Post update(@RequestBody Post post) {
		return postService.update(post);
	}
	
	@PostMapping(path="/post/add")
	public Post add(@RequestBody Post post) {
//		Author author = post.getAuthor();
//		if(!authorService.getAll().contains(post.getAuthor())) {
//			return new Exception
//		}
		return postService.add(post);
	}
	
	@DeleteMapping(path="/post/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		postService.delete(id);
	}
	
}
