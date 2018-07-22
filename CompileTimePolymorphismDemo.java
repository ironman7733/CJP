package com.corejavapractice;

public class CompileTimePolymorphismDemo {
	
	public void m1(int a)
	{
		System.out.println("int m1 method");
	}
	public void m1(int a,int b)
	{
		System.out.println("int, int m1 method");
	}
	public void m1(char ch)
	{
		System.out.println("char m1 method");
	}
	

	public static void main(String[] args) {
		CompileTimePolymorphismDemo obj = new CompileTimePolymorphismDemo();
		obj.m1(10);
		obj.m1(10,20);
		obj.m1('c');
	}

}
