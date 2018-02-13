package creational.strategyPattern;

public class WorkWithAnimals {
	

	public static void main(String[] args){
	
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		System.out.println("dog "+sparky.fly());
		System.out.println("bird "+tweety.fly());
	}
	
}
