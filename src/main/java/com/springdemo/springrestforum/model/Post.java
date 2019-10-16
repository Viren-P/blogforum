package com.springdemo.springrestforum.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="post_table")
public class Post {
	
	@Id
	private int id;
	@Column(name="Title", nullable=false)
	private String title;
	@Column(name="Content", nullable=false, length=5000)
	private String content;
	@ManyToOne
	private Author author;
	@Transient
	private List<String> comments;
	@ManyToOne
	private Category category;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public List<String> getComments() {
		return comments;
	}
	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + ", author=" + author + ", comments="
				+ comments + ", category=" + category + "]";
	}
	
	
	
	
	
}
