

public interface Animal {
	
	//public boolean says();
	public boolean swim();
	public boolean fly();
	public boolean sing();
	public boolean walk();
}

 class Dog implements Animal{
	
	public boolean says(){
		
		System.out.println("Woof, woof");
		return true;
	}

	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		System.out.println("DOG cannot fly");
		return false;
	}

	@Override
	public boolean sing() {
		// TODO Auto-generated method stub
		System.out.println("DOG cannot Sing");
		return false;
	}

	@Override
	public boolean walk() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
 class Cat implements Animal{
		
		public boolean says(){
			
			System.out.println("Meow");
			return true;
		}

		@Override
		public boolean swim() {
			// TODO Auto-generated method stub
			System.out.println("cannot swim");
			return false;
		}

		@Override
		public boolean fly() {
			// TODO Auto-generated method stub
			System.out.println("cannot fly");
			return false;
		}

		@Override
		public boolean sing() {
			// TODO Auto-generated method stub
			System.out.println("cannot sing");
			return false;
		}

		@Override
		public boolean walk() {
			// TODO Auto-generated method stub
			return true;
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
	public boolean swim() {
		// TODO Auto-generated method stub
		System.out.println("cannot swim");
		return false;
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		System.out.println("can fly");
		return true;
	}

	@Override
	public boolean sing() {
		// TODO Auto-generated method stub
		System.out.println("can sing");
		return true;
	}

	@Override
	public boolean walk() {
		// TODO Auto-generated method stub
		System.out.println("can walk");
		return true;
	}
	
	
}

class Dolphin implements Animal {

	

	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		System.out.println("can swim");
		return true;
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		System.out.println("cannot fly");
		return false;
	}

	@Override
	public boolean sing() {
		// TODO Auto-generated method stub
		System.out.println("cannot sing");
		return false;
	}

	@Override
	public boolean walk() {
		System.out.println("cannot walk");
		// TODO Auto-generated method stub
		return false;
	}

}

class Frog implements Animal {

	

	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		
		return true;
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sing() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean walk() {
		// TODO Auto-generated method stub
		return true;
	}

}

class Butterfly implements Animal {

	

	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean sing() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean walk() {
		// TODO Auto-generated method stub
		return true;
	}

}

 class Result {

	public static void main(String args[]){
		Shark shark = new Shark();
		shark.features("large", "grey");
		ClownFish clownFish = new ClownFish();
		clownFish.features("small", "orange");
		
		int fly  =0;
		int walk=0;
		int sing=0;
		int swim=0;
		
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new ClownFish(),
				new Dolphin(),
				new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
		};
		int size = animals.length;
		System.out.println(size+"size");
		
		for(int i=0;i<size;i++)
		  {
			if(animals[i].fly()){
				fly++;
				//System.out.println("j value :" + j);
			}
			if(animals[i].walk()){
				walk++;
				//System.out.println("j value :" + j);
			}
			if(animals[i].sing()){
				sing++;
				//System.out.println("j value :" + j);
			}
			if(animals[i].swim()){
				swim++;
				//System.out.println("j value :" + j);
			}
			System.out.println("no. of animals fly :" + fly);
			System.out.println("no. of animals walk :" + walk);
			System.out.println("no. of animals sing :" + sing);
			System.out.println("no. of animals swim :" + swim);
		  }
		
		
	}
	
}
	
