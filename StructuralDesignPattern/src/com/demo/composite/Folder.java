package com.demo.composite;

import java.util.ArrayList;
import java.util.List;

class Folder implements FileComponent {
    private String name;
    private List<FileComponent> components;
    
    public Folder() {
		super();
	}

	public Folder(String name) {
		this.name = name;
		this.components = new ArrayList<>();
	}

	// Implementing display and getSize for a folder
    
    public void display() {
        System.out.println("Folder: " + name);
        for (FileComponent component : components) {
            component.display();
        }
    }

    public int getSize() {
        int totalSize = 0;
        for (FileComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    public void addComponent(FileComponent component) {
        components.add(component);
    }

    public void removeComponent(FileComponent component) {
        components.remove(component);
    }
}

