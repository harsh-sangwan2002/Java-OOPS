package com.harsh.packages.staticExample;

class Test{

    String name;

    public Test(String name){
        this.name = name;
    }
}

public class InnerClass {

    static class Test2{

        String name;

        public Test2(String name){
            this.name = name;
        }

        @Override
        public String toString(){
            return this.name;
        }
    }

    public static void main(String[] args) {

        Test t1 = new Test("Harsh");
        Test t2 = new Test("Vinay");
        System.out.println(t1.name);

        // or we can make the Test2 class as static
        Test2 ta = new Test2("Harsh");
        System.out.println(ta);

//        InnerClass obj = new InnerClass();
//        Test2 ta = obj.new Test2("Harsh");

    }
}
