package com.demo.composite;

class File implements FileComponent {
	
	private String name;
	private int size;

	public File() {
		super();
	}

	public File(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	// Implementing display and getSize for a file
	public void display() {
		System.out.println("File: " + name);
	}

	public int getSize() {
		return size;
	}
}
