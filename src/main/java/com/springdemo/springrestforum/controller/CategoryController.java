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

import com.springdemo.springrestforum.model.Category;
import com.springdemo.springrestforum.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping(path="/category")
	public List<Category> getAll(){
		return categoryService.getAll();
	}
	
	@GetMapping(path="/category/id/{id}")
	public Category getById(@PathVariable("id") int id) {
		return categoryService.getById(id);
	}
	
	@GetMapping(path="/category/name/{name}")
	public Category getByName(@PathVariable("name") String name) {
		return categoryService.getByName(name);
	}
	
	@PostMapping(path="/category/add")
	public Category add(@RequestBody Category category) {
		return categoryService.add(category);
	}
	
	@PutMapping(path="/category/update")
	public Category update(@RequestBody Category category) {
		return categoryService.update(category);
	}
	
	@DeleteMapping(path="/category/delete/id/{id}")
	public void deleteById(@PathVariable int id) {
		categoryService.deleteById(id);
	}
	
	@DeleteMapping(path="/category/delete/name/{name}")
	public void deleteByName(@PathVariable String name) {
		categoryService.deleteByName(name);
	}
	
}
