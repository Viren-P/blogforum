package com.springdemo.springrestforum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdemo.springrestforum.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
