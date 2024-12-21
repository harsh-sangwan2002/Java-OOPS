package com.harsh.generics;

import java.util.Arrays;

public class CustomArrayList {

    static class ArrayList<T>{
        private Object[] data;
        private int size;

        ArrayList(){

            // Cannot create an instance of Generic Type
            data = new Object[10];
            size = 0;
        }

        public void add(T val){

            if(size==data.length)
                resize();

            data[size++] = val;
        }

        private void resize() {

            Object[] arr = new Object[2*data.length];

            for(int i=0; i<data.length; i++)
                arr[i] = data[i];

            data = arr;
        }

        public T remove(int idx){

            if(idx<0 || idx>=size){
                System.out.println("Array index out of bounds exception.");
                return (T) new Object();
            }

            Object val = data[idx];

            for(int i=idx; i<data.length-1; i++)
                data[i] = data[i+1];

            size--;
            return (T)val;
        }

        public void set(int idx, T val){

            if(idx<0){
                System.out.println("Negative index is not allowed.");
            }

            else if(idx>=size)
                resize();

            data[idx] = val;
        }

        public T get(int idx){

            if(idx<0 || idx>=size) {
                System.out.println("Array index out of bounds exception.");
                return (T) new Object();
            }

            return (T) data[idx];
        }

        public int size(){

            return size;
        }

        @Override
        public String toString(){

            return Arrays.toString(data);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.size());
    }
}
