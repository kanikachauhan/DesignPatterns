package creational.strategyPattern;

public class Animal {

	private String name;
	private int weight;
	private String sound;
	protected Flys flyType;
	public String fly(){
		return flyType.fly();
	}
	public void setFlyType(Flys newFlyType){
		newFlyType = flyType;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setWeight(int newWeight){
		if(newWeight>0){
			weight = newWeight;
		}else{
			System.out.println("Weight must ber greater than 0");
		}
	}
	public int getWeight(){
		return weight;
	}
	public void setSound(String sound){
		this.sound = sound;
	}
	public String getSound(){
		return sound;
	}
}
