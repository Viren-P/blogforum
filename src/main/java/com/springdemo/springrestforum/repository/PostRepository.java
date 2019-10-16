package com.springdemo.springrestforum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdemo.springrestforum.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}

