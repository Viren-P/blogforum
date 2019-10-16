package com.springdemo.springrestforum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.springrestforum.model.Category;
import com.springdemo.springrestforum.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> getAll(){
		return categoryRepository.findAll();
	}
	
	public Category getById(int id){
		return categoryRepository.findById(id).orElse(new Category());
	}
	
	public Category getByName(String name) {
		for(Category c : this.getAll()) {
			if(c.getName().trim().equalsIgnoreCase(name)) {
				return this.getById(c.getId());
			}
		}
		return new Category();
	}
	
	public Category add(Category category) {
		categoryRepository.save(category);
		return category;
	}
	
	public Category update(Category category) {
		Category categoryExisting = this.getById(category.getId());
		categoryExisting.setName(category.getName());
		categoryExisting.setPosts(category.getPosts());
		categoryRepository.save(categoryExisting);
		return categoryExisting;
	}
	
	public void deleteById(int id) {
		categoryRepository.deleteById(id);
	}
	
	public void deleteByName(String name) {
		for(Category c : this.getAll()) {
			if(c.getName().trim().equalsIgnoreCase(name)) {
				this.deleteById(c.getId());
			}
		}
	}
}
