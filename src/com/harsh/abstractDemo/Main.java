package com.harsh.abstractDemo;

public class Main {

    public static void main(String[] args) {

        Son son = new Son(21);
        son.career();

        Daughter daughter = new Daughter(17);
        daughter.career();

        // Cannot create objects of abstract classes


    }
}
