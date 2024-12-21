package com.harsh.accessControl.pkg1;

public class Main {

    public static void main(String[] args) {

        A obj = new A(34,"Harsh",true);

        // Cannot access private data
        System.out.println(obj.getNum());

        System.out.println(obj.str);
        System.out.println(obj.arr);
        System.out.println(obj.flag);
    }
}
