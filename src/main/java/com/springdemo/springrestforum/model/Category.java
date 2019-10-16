package com.springdemo.springrestforum.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="category_table")
public class Category {

	@Id
	private int id;
	@Column(name = "Name", nullable=false)
	private String name;
	@JsonIgnore
	@OneToMany(mappedBy="category")
	private List<Post> posts = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	@Override
	public String toString() {
		return "Category [name=" + name + ", posts=" + posts + "]";
	}
}
