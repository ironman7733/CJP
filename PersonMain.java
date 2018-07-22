package com.corejavapractice;

import com.corejavapractice.Person.Gender;




public class PersonMain 
{
    
    
    public static void main(String[] args) 
    {
    	
        System.out.println("Person Details");
        System.out.println("____________________");
        
        //for parameterized constructor
        //Person obj = new Person("Murali","Krishna",Gender.M);
        //obj.mobileNumber();
        //obj.calculateAge();
        
        
        Person obj = new Person();
        obj.mobileNumber();
        obj.calculateAge();
        obj.getFullName();
        
        
  
        
        
    }
        
}
