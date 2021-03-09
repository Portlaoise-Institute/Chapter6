package com.mycompany.chapter6;

public class Constructor {

    public static void main(String[] args) {

        //Create an instance of the car class with full constructor
        Car opel = new Car("Opel", "White", "Saloon");
        
        //Create another instance of the car class
        Car ford = new Car("Ford"); 
        ford.setColor("Orange");
        ford.setBodyType("Saloon");
        
        //Display colour of the Opel car
        System.out.println("Colour of Opel Car: "+
                opel.getColor());
        
        //Display bodyType of the ford car
        System.out.println("BodyType of Ford Car: "+
                ford.getBodyType());
        
        
        /* Calling Setter and Getter Example */
        
        
        //Create a new Car called myCar
        Car myCar = new Car();
        
        //Set the properties for myCar
        myCar.setMaker("Toyota");
        myCar.setColor("Navy");
        myCar.setBodyType("HatchBack");
        
        //Get the properties for myCar
        System.out.println("\nMake of myCar: "+myCar.getMaker());
        System.out.println("Colour of myCar: "+myCar.getColor());
        System.out.println("BodyType of myCar: "+myCar.getBodyType());
        
        
        
        
        
        // New Car testing toString method
        
        Car myLexus = new Car("Lexus", "Silver", "Saloon");
        
        //Display the car
        
        System.out.println("\n" + myLexus.toString());
        
        
        
        
    } //end main 
    
} //end class
