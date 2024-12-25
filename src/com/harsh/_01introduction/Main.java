package com.harsh._01introduction;

import java.util.Arrays;

// Create a class
class Student{
    int rno;
    String name;
    float marks;

    Student(){
        this(13,"Default name",92.5f);
    }

    // Special type of function which is invoked when an object is created
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    void changeName(String name){
        this.name = name;
    }

    void greeting(){
        System.out.println("Hello! My name is: "+name);
    }
}

public class Main {

    public static void main(String[] args) {

//        // Store 5 roll no's
//        int[] numbers = new int[5];
//
//        // Store 5 names
//        String[] names = new String[5];

        // Data of 5 students -> {rollNo, name, marks}
        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));

        // Just declaring
        Student kunal = new Student(13,"Kunal",92.5f);

        System.out.println(kunal.rno);
        System.out.println(kunal.marks);
        System.out.println(kunal.name);

        kunal.greeting();

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "something something";
        System.out.println(two.name);
    }
}