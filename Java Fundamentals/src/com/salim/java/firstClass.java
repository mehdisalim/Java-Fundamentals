package com.salim.java;

public class firstClass {

    /**
    * Initialization blocks do not replace the constructors and may be used along with them.
    * But it is very important to mention that initialization blocks are always called before any constructor.
    */

    // initialization Block ( Constructor )
    {
        System.out.println("First Constructor");

        // Variable => the Default value
        boolean dBoolean; // default Value : False
        byte dByte;       // default Value : 0
        short dShort;     // default Value : 0
        int dInt;         // default Value : O
        long dLong;       // default Value : 0l
        float dFloat;     // default Value : 0.0f
        double dDouble;   // default Value : 0.0d
        char dChar;       // default Value : u0000 == null
        String dString;   // default Value : null
        Object dObject;   // default Value : null

    }

    // Main Constructor
    // Constructor With No-arguments
    public firstClass() {
        System.out.println("Second Constructor");
    }

    // Second Constructor with Arguments
    public firstClass(String arg1 , int arg2) {
        System.out.println("third Constructor");
    }


}
