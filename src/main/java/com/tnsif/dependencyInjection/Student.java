package com.tnsif.dependencyInjection;

public class Student {
    
    private int id;
    private String name;

//   // Getter and Setter for id
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    // Getter and Setter for name
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }

    
    public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	// Display method
    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}
