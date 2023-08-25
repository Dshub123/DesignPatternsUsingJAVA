package com.demo.simplefactorypattern;

import java.time.LocalDateTime;

/*
 * Abstract post class. Represent a generic post on web site
 * */
public class Post {

	private Long id;
	
	private String title;
	
	private String content;
	
	private LocalDateTime createdOn;
	
	private LocalDateTime publishOn;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDateTime getPublishOn() {
		return publishOn;
	}

	public void setPublishOn(LocalDateTime publishOn) {
		this.publishOn = publishOn;
	}
	
	
	
}
