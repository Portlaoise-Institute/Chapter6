
package com.mycompany.chapter6;

//Class declaration 
public class Scope {
    
    //Insert a global class String variable
    //constant of the same name as the local method
    //variables
    final static String txt = "This is a global variable of the Scope class";
            
    
    public static void main(String[] args) {
        
        //Declare and initialise a local String variable
        String txt = "This is a local variable in the "
                + "main method";
        
        //Output its value
        System.out.println(txt);
        
        //call the sub method
        sub();
        
        //Output the value of the global class variable
        System.out.println(Scope.txt);
        
    } //end main 
    
    /**********************************************/
    
    public static void sub()
    {
//        Declare and initialise a local String variable
//        of the same name as the variable in the main method
//        String txt = "This is a local variable in the "
//                + "sub method";
        System.out.println(txt);
        
    } //end sub 
    
} //end class 
