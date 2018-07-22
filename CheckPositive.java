package com.corejavapractice;

import java.util.Scanner;

public class CheckPositive 
{
	
	static String str;

	public static void main(String[] args) 
	{

		CheckPositive obj = new CheckPositive();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		boolean check;
		check = obj.CheckPositivity(str);
		System.out.println(check);	
		sc.close();
		
	}
	public boolean CheckPositivity(String str) 
	{
		
		//this.str = str2;
		boolean check = true;
		for(int i = 0; i<str.length()-1; i++)
		{
			if(str.charAt(i) > str.charAt(i+1))
			{
				check = false;
				break;
			}
		}
		
		return check;
	}

}
