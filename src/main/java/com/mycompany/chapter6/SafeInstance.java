package com.mycompany.chapter6;

public class SafeInstance {
    
    public static void main(String[] args) {
      
        //Create an instance of the Car Class
        Car porsche = new Car();
        
        //Call the public setCar method to assign values to
        //the private instance variables
        porsche.setCar("Porsche", "Blue", "Coupe");
        
        
       //Call the public setCar method to retrieve the stored 
       //attribute values and also call the private behaviour method
       porsche.getCar();
       

       //Create another instance, assigning and retrieving values
       Car bentley = new Car();
       bentley.setCar("Bentley", "Green", "Saloon");
       bentley.getCar();
       
       //Create another instance, assigning and retrieving values
       Car ford = new Car();
       ford.setCar("Ford", "Silver","HatchBack");
       ford.getCar();
       
        
    } //end method
    
} //end class 
