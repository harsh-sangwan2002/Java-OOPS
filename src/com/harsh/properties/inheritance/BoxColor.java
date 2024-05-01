package com.harsh.properties.inheritance;

// Hierarchical Inheritance
public class BoxColor extends Box{

    String color;

    BoxColor(){
        super();
        this.color = "Red";
    }

    // Compile-time polymorphism
    BoxColor(BoxColor other){
        super(other);
        this.color = other.color;
    }
}
