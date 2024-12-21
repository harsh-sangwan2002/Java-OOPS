package com.harsh.exceptionHandling;

public class Main {

    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        try {
            String name = "harsh";
            if(name.equals("harsh"))
                throw new MyException(name);
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Exception class prints: "+e.getMessage());
        }
        finally {
            System.out.println("It will always run.");
        }
    }

    // throws is used to define the type of exception
    // throw is used to actually throw and exception
    static int divide(int a, int b) throws ArithmeticException{

        if(b==0)
            throw new ArithmeticException("Please don't divide by 0");

        return a/b;
    }
}
