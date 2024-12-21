package com.harsh.introduction;

public class Wrapper {

    static void swap1(int a, int b){

        int temp = a;
        a = b;
        b = temp;
    }

    static void swap2(Integer a, Integer b){

        Integer temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        swap1(a,b);

        Integer A = 10;
        Integer B = 20;
        // This will not swap because Integer is a final class
        swap2(A,B);

        System.out.println(a);
        System.out.println(b);

        System.out.println(A);
        System.out.println(B);

        final int x = 2;
//        x = 3;

        // final variables have to be initialised during declaration
        final int  y = 2;
    }
}
