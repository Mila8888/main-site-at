package ru.geekbraibs.examples.exceptions;

public class StackOverflowError {
    public static void main(String[] args){
        test();
    }
//Recursion to Java - StackOverflowError
    public static void test(){
        test();
    }


}

