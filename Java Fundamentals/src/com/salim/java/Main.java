package com.salim.java;

public class Main {

    static boolean aBoolean2;
    static Boolean aBoolean ;

    public static void main(String[] args) {
        // Calling the initialization block first then the main constructor
        new firstClass();

        // Calling the initialization block first then the Second Constructor with Arguments
        new firstClass("",1);
        


    }
}
