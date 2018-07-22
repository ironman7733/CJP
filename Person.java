package com.corejavapractice;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Person 
{

	String firstName;
    String lastName;
    Gender gender;
    
    Person(String fname,String lname,Gender gender)
    {
        setFirstname(fname);
        setLastname(lname);     
        setGender(gender);
    
    }
    
    
    public String getFirstname() {
        return firstName;
    }
    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }
    public String getLastname() {
        return lastName;
    }
    public void setLastname(String lastname) {
        this.lastName = lastname;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
   
	
    
    
    Person()
    {
    	Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First Name:");
        String firstName = input.next();
        

        System.out.println("Enter Last Name:");
        String lastName = input.next();

        System.out.println("Enter Gender:");
        String gender = input.next();       		// accept gender input from user as string
        Gender gdr = Gender.valueOf(gender);        // converting to enum type
        
        setFirstname(firstName);
        setLastname(lastName);     
        setGender(gdr);
        
    }
   



	public enum Gender
    {
        
        M,F;
        
        // to check user input with enum values
        
        public boolean isMember(String gender)
        {
            Gender[] gendervalues = Gender.values();
            for(Gender genval : gendervalues)
                if(genval.equals(gender))
                    return true;
            		return false;
        }
    }
    
    
    
    
    public void mobileNumber()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Mobile Number:");
        String mno=input.next();
    
        System.out.println("First Name:" + " " + firstName);
        System.out.println("Last Name:" + " " + lastName);
        System.out.println("Gender:"+" "+getGender());
        
        if(Pattern.matches("[789][0-9]{9}", mno))
        {
            System.out.println("Mobile Number:"+" "+mno);
   
        }
        else
        {
            System.out.println("Enter 10 digit mobile number starting with 7/8/9");
        }
   
    }
    

	public void calculateAge()
    {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Date of Birth in dd/MM/yyyy format:");
		String readdate  = input.nextLine();
		LocalDate enteredDate = LocalDate.parse(readdate,formatter);

		
		LocalDate end = LocalDate.now();
		Period period = enteredDate.until(end);
		System.out.println("Age:"+ period.getYears());
		
    }
    public void getFullName()
    {
    	firstName = getFirstname();
    	lastName = getLastname();
    	System.out.println("Full Name:"+firstName+lastName );
    
    }
    
}



    
