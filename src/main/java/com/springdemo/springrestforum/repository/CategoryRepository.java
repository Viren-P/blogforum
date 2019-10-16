package com.springdemo.springrestforum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdemo.springrestforum.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
