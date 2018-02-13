package creational.strategyPattern;

public class Dog extends Animal{

	public Dog(){
		super();
		setSound("bark");
	   flyType = new Cannotfly();
	}
}
