package com.springdemo.springrestforum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.springrestforum.model.Post;
import com.springdemo.springrestforum.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	PostRepository postRepository;
	
	public List<Post> getAll(){
		return postRepository.findAll();
	}
	
	public Post getById(int id) {
		return postRepository.findById(id).orElse(new Post());
	}
	
	public Post add(Post post) {
		postRepository.save(post);
		return post;
	}
	
	public Post update(Post post) {
		Post postExisting = this.getById(post.getId());
		postExisting.setAuthor(post.getAuthor());
		postExisting.setCategory(post.getCategory());
		postExisting.setComments(post.getComments());
		postExisting.setContent(post.getContent());
		postExisting.setTitle(post.getTitle());
		postRepository.save(postExisting);
		return postExisting;
	}
	
	public void delete(int id) {
		postRepository.deleteById(id);
	}
	
}
