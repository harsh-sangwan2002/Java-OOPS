package com.harsh._01introduction;

class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }

    @Override
    public void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }
}

public class Wrapper {

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {

        int a = 10, b = 20;
        Integer num1 = 10, num2 = 20;

        swap(a,b);
        swap(num1,num2);

        System.out.println(a+" "+b);
        System.out.println(num1+" "+num2);

        final int bonus = 2;
//        bonus = 3;

        final A kunal = new A("Kunal");
        kunal.name = "Kunal";

//        kunal = new A("Harsh");  // Error

        A obj = new A("Harsh");

        for(int i=0;i<1000000;i++){
            obj = new A("Vinay");
        }
    }
}
