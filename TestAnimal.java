package com.corejavapractice;
//Method Overriding

//Overriden Class
class Animal {
	public void sound() {
		System.out.println("Animal is making a sound");
	}
}
//Overriding Class
class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("Meow");
	}
}

public class TestAnimal {
	public static void main(String args[]) {
		Animal obj = new Cat();
		obj.sound();

	}
}
