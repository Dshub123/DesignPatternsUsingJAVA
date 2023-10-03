package com.demo.composite;

public class Client {

	public static void main(String[] args) {
		
		FileComponent file1 = new File("file1.txt", 100);
		FileComponent file2 = new File("file2.txt", 200);

		FileComponent folder1 = new Folder("Folder 1");
		

		FileComponent folder2 = new Folder("Folder 2");
	

		folder2.display();
		int totalSize = folder2.getSize();
		System.out.println("Total size: " + totalSize);

	}

}
