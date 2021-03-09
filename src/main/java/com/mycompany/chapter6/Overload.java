package com.mycompany.chapter6;

public class Overload {
    
    public static void main(String[] args) {
       
        //call three different overloaded methods
        //and pass them argument values
        System.out.println(write(12));
        System.out.println(write("Twelve"));
        System.out.println(write(4,16));
        
        // dog.talk()   ->  dog is barking
        //duck.talk()   -> duck is quack
        //cat.talk()    -> cat is meowing
        
    } //end main 

    /*************************************/
    
    //implement the overloaded write methods
    
    public static String write(int num) {
        return ("Integer passed is: "+num);
    }//end method
    
    public static String write(String num) {
        return ("String passed is: "+num);
    }//end method
    
    public static String write(int num1, int num2) {
        return ("Sum Total is: "+(num1*num2));
    }//end method
    
} //end class 
