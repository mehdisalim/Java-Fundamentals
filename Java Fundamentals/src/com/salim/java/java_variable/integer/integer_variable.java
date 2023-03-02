package com.salim.java.java_variable.integer;

public class integer_variable {

    //int integer ==> 32 bits == 4 bytes
    int anInt; // default value => 0
    public void anInt(){
        int value   = 1234567;
        int value2  = 1_2_3_4_5_6_7;

        // max && min Value
        int maxValue    = 2_147_483_647; // == 2^31 - 1
        int minValue    = -2_147_483_648;// == 2^31 * (-1)
    }

    //byte integer ==> type : 1 byte == 8 bits
    byte aByte; // default value => 0
    public void aByte(){
        byte value  = 123;
        byte value2 = 1_2_3;

        // max && min Value
        byte maxValue   = 127; // == 2^7 - 1
        byte minValue   = -128;// == 2^7 * (-1)
    }

    //short Integer ==> 2 bytes = 16 bits
    short aShort; // default value => 0
    public void aShort(){
        short value     = 12345;
        short value2    = 1_2_3_4_5;

        // max && min Value
        short maxValue  = 32_767; // == 2^15 - 1
        short minValue  = -32_768;// == 2^15 * (-1)
    }

    //long Integer ==> 8 bytes == 64 bits
    long aLong; // default value => 0
    public void aLong(){

        long value  = 123456789000L;
        long value2 = 1_2_3_4_56_789_000L;

        // max && min Value
        // we add L to defined type of Integer
        long maxValue   = 9_223_372_036_854_775_807L; // == 2^63 - 1
        long minValue   = -9_223_372_036_854_775_808L;// == 2^63 * (-1)
    }
}
