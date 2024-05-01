package com.harsh.introduction;

// Class is a template and doesn't occupy space in the memory
// Class is a named group of properties and functions
class Student{

    // These are called instance variables
    int rno;
    String name;
    float marks;

    // Constructor is a special function which runs when an object is created
    Student(){

        // this can also be used to call another constructor
        this(12,"Harsh",91.2F);

        this.rno = 12;
        this.name = "Harsh";
        this.marks = 92.3F;
    }

    // Constructor Overloading
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // Copy constructor
    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    void greeting(){
        System.out.println("Hello! My name is: "+this.name);
    }
}