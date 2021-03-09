package com.mycompany.chapter6;

public class Multi {

    public static void main(String[] args) {
        
        //Declare and initialise a local String
        //variable, and output its contents
        String msg = "This is a local variable "
                + "in the Multi class";
        System.out.println(msg);
        
        //Output the contents of a class String
        //variable constant named "txt" from a class
        //called "Data"
        System.out.println(Data.txt);
     
        //Call a method named "greeting" from the
        //Data class
        Data.greeting();
        
        //Call a method named "line" from the 
        //Draw class
        Draw.line();
        
    } // end main 
        
} //end class
