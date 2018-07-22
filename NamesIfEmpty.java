package com.corejavapractice;

import java.util.Scanner;

public class NamesIfEmpty extends Exception 
{
	private String firstName;
	private String lastName;

	public NamesIfEmpty(String firstName, String lastName) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() 
	{
		return "Names should not be Empty";
	}

	public void namesIfEmpty() throws NamesIfEmpty 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName = sc.nextLine();
		System.out.println("Enter Last Name:");
		String lastName = sc.nextLine();
		if (firstName.isEmpty()) {
			throw new NamesIfEmpty(firstName, lastName);
		}
	}

	public static class ExceptionTest 
	{
		public static void main(String[] args) 
		{

			try 
			{
				NamesIfEmpty nie = new NamesIfEmpty("murali", "krishna");
				nie.namesIfEmpty();

			} catch (NamesIfEmpty nie) 
			{
				System.out.println(nie);
			}

		}

	}
}