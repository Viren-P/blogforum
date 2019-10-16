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
@Table(name="author_table")
public class Author {
	
	@Id
	private int id;
	@Column(name="FirstName", nullable=false)
	private String firstName;
	@Column(name="LastName", nullable=false)
	private String lastName;
	@JsonIgnore
	@OneToMany(mappedBy="author")
	private List<Post> posts = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", posts=" + posts + "]";
	}
	
	
	
}
