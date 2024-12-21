package com.harsh.generics.comparison;

public class Student implements Comparable<Student>{

    int roll;
    float marks;

    Student(int roll, float marks){
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o){
        return (int)(this.marks-o.marks);
    }

    @Override
    public String toString(){
        return ""+roll;
    }
}
