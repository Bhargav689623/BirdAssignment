package com.kony.p2p.dao;

public interface Animal {
	
	public void says();

}

 class Dog implements Animal{
	
	public void says(){
		
		System.out.println("Woof, woof");
	}
	
}
 class Cat implements Animal{
		
		public void says(){
			
			System.out.println("Meow");
		}
		
	}
 
 
	 

class Parrot implements Animal{
	
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.says();
		Cat cat = new Cat();
		cat.says();
		Rooster rooster = new Rooster();
		rooster.says();
		Duck duck = new Duck();
		duck.says();
	}

	@Override
	public void says() {
		// TODO Auto-generated method stub
		
	}
}
	
