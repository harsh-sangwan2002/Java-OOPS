package com.harsh.properties.polymorphism;

public class Main {

    public static void main(String[] args) {

        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        // Run-time polymorphism
        // Also called as late binding
        Shapes triangle = new Triangle();

        shape.area();
        circle.area();
        square.area();

        // Type of method being called depends on the object type and not the reference type
        // This is resolved using dynamic method dispatch by Java.
        triangle.area();
        triangle.staticFn();
        Triangle.staticFn();
    }
}
