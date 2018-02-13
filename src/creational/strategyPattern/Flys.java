package creational.strategyPattern;

public interface Flys {
	String fly();
}

class Canfly implements Flys{

	@Override
	public String fly() {
		return "Can Fly";
	}
	
}
class Cannotfly implements Flys{

	@Override
	public String fly() {
		return "Cannot Fly";
	}
	
}