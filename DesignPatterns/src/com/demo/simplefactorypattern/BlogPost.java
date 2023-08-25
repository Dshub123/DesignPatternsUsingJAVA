package com.demo.simplefactorypattern;


/*
 * Represents a blog post
 * 
 */
public class BlogPost extends Post{
	
	private String auther;
	
	private String[] tags;

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}
	

}
