package creational.strategyPattern;

public class Bird extends Animal{

	public Bird(){
		super();
		setSound("chirp");
		flyType = new Canfly();
	}
	
}
