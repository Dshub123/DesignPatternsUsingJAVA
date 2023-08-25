package com.demo.simplefactorypattern;

public class ProductPost extends Post {
	
	private String manufacturer;
	
	private String description;

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
