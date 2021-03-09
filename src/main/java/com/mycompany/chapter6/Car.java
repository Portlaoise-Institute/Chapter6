package com.mycompany.chapter6;
//Class Declaration 
public class Car {
        
    // instance variables - describe the properties for your class blueprint
    private String maker;
    private String color;
    private String bodyType;
    
    
    //Add a constructor for our class
    //public access modifier, no return type for the constructor
    
    //multiple constructors in your class - constructor overloading 
    
    
    //Overloaded constructor - full constructor
    public Car(String maker, String color, String bodyType)
    {
        this.maker = maker;
        this.color = color;
        this.bodyType = bodyType; 
        
    } //end constructor
        
       
    
    public Car(String maker, String color)
    {
        this.maker = maker;
        this.color = color;
        this.bodyType = "not specified"; 
        
    } //end constructor
 
    
    
    //One argument constructor
    public Car(String maker)
    {
        this.maker = maker;
        this.color = "Not specified";
        this.bodyType = "Not specified";
    }
    
    
    //Empty Car Constructor
    public Car()
    {
        maker = "Porsche";  //Not specified
        color = "Silver";   //Colour not assigned
        bodyType = "Coupe";
        
    } //end constructor
            
    
    //Setter and getter methods
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public String getColor() 
    {
        return color;
    }
    
    public void setMaker(String maker)
    {
        this.maker = maker;
    }
    
    public String getMaker() 
    {
        return maker;
    }
    
   public void setBodyType(String bodyType)
    {
        this.bodyType = bodyType;
    }
    
    public String getBodyType() 
    {
        return bodyType;
    }
    
    
    //Create a toString method to display the car
    
    public String toString()
    {
        
        return "Make: " + maker + "\nColor: " + color
                + "\nBody Type: " + bodyType;
        
    } //end toString method
    
    
    
    
    
    
    
    //instance method - describe the behaviour of the car
    private String accelerate()
    {
        String motion="Accelerating....";
        return motion;
    }
    
    
    //toString method to display car (without calling accelerate method)
    
    
    
    //Add a public method to assin passed argument
    //values to each private variable 
    public void setCar(String brand, String paint, String style)
    {
        maker = brand;
        color = paint;
        bodyType = style;   
    } //end setter method 
    
    
    
    //Add a public method to retrieve the private variable values
    //and to call the private method
    public void getCar() 
    {
        System.out.println(maker + " paint is " + color);
        System.out.println(maker + " style is " + bodyType);
        System.out.println(maker + " is " +accelerate() + "\n");
        
    } //end method 
    
    
    //EXAMPLE 1&2 Pages 106-109
    
    //Declare and initialise two global String
    //constants describing attributes
//    public final static String color = "Red";
//    public final static String bodyType = "Coupe";
    
    //Add a global method describing a behaviour
//    public static String accelerate() {
//        String motion = "Accelerating...."; 
//        return motion;
//    } //end method
    
    
    
} //end class
