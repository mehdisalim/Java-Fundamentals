package com.salim.java.java_variable.bool;
// TODO: Created By : Mehdi Salim
//  Date : 18/04/2021
public class boolean_variable {

    // Boolean Variable
    boolean aBoolean=true; // default Value => False

    // Boolean Object
    Boolean aBoolean2=true; // default Value => null
    Boolean aBoolean3=new Boolean(Boolean.FALSE); // anther method to create an object but this is rarely to used

    // this method take boolean constructor
    public void setBoolean(boolean value){
        // type of this method is void
        // we don't need to add return
    }

    // this method return boolean value
    public boolean getBoolean(){
        boolean value=true /* or false */ ;
        return value;
    }

    // Boolean Object methods
    public void booleanMethods(){
        //this method get the current value
        aBoolean2.booleanValue();

        //this method compare two boolean return int ( 0=false || 1=true )
        aBoolean2.compareTo(aBoolean);

        //convert boolean to string
        aBoolean2.toString();

        //compare two boolean ( return boolean true or false )
        aBoolean2.equals(aBoolean);

        // hashCode
        aBoolean2.hashCode();

    }

    // Constructor With boolean Variable
    public boolean_variable(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    // Getter and Setter Methods
    public boolean isaBoolean() {
        return aBoolean;
    }
    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

}
