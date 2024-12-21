package com.harsh.introduction;

public class Garbage {

    Garbage(){
        System.out.println("Object created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }

    public static void main(String[] args) {

        Garbage g;

        for(int i=0; i<1000000; i++)
            g = new Garbage();
    }
}
