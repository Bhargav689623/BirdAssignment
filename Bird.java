package com.kony.p2p.dao;

public interface Bird {
	public void says();
	public void swim();
	public void fly();
	public void sing();
	public void walk();

}
class Duck implements Bird{
	public void says(){
		System.out.println("Quak quak");
	}
	public void swim(){
		System.out.println("i can swim");
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
}

class Chicken implements Bird{
	public void says(){
		System.out.println("Cluck, cluck");
	}
	public void fly(){
		System.out.println("i cannot fly");
	}
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
}
class Rooster implements Bird{
	public void says(){
		System.out.println("Cock-a-doodle-doo");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
	
}
class Fish implements Bird{
	public void sing(){
		System.out.println("Fishes dont sing");
	}
	public void walk(){
		System.out.println("Fishes dont walk");
	}
	public void swim(){
		System.out.println("Fishes can Swim");
	}
	public void features(String size, String color){}
	@Override
	public void says() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}
class Shark extends Fish{
	public void features(String size,String color){
		
		System.out.println("size :"+size+"color:"+color);
	}
	
	
}

class ClownFish extends Fish{
	public void features(String size,String color){
		
		System.out.println("size :"+size+"color:"+color);
	}
	
	
}

class Alarm extends Rooster{
	
	public void says(){
		System.out.println("Cock-a-doodle-doo");
	}
}
