

public class Bird implements Animal{
	public boolean says(){return true;}
	public boolean swim(){return true;}
	public boolean fly(){return true;}
	public boolean sing(){return true;}
	public boolean walk(){return true;}

}
class Duck extends Bird{
//	public boolean sing(){
//		System.out.println("Quak quak");
//		return true;
//	}
//	public boolean swim(){
//		System.out.println("i can swim");
//		return true;
//	}
	public boolean fly(){
		System.out.println("i cannot fly");
		return false;
	}
}

class Chicken extends Bird{
//	public boolean sing(){
//		System.out.println("Cluck, cluck");
//		return true;
//	}
	public boolean fly(){
		System.out.println("i cannot fly");
		return false;
	}
//	public boolean walk(){
//		System.out.println("i can walk");
//		return true;
//	}
	
}
class Rooster extends Bird{
	public boolean fly(){
		System.out.println("i cannot fly");
		return false;
	}

		
}
class Fish implements Animal{
	@Override
	public boolean walk(){
		System.out.println("Fish dont walk");
		return false;
	}
//	public void swim(){
//		System.out.println("Fishes can Swim");
//	}
	public void features(String size, String color){}
	@Override
	public boolean sing() {
		// TODO Auto-generated method stub
		System.out.println("Fish dont sing");
		return false;
	}
	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		System.out.println("Fish can swim");
		return true;
	}
	@Override
	public boolean fly() {
		System.out.println("Fish dont fly");
		// TODO Auto-generated method stub
		return false;
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
	
	public boolean says(){
		System.out.println("Cock-a-doodle-doo");
		return true;
	}
}
