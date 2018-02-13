package creational.factoryPattern;

public abstract class EnemyShip {

	private String name;
	private double amntDamage;
	
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name = newName;
	}
	public double getDamage(){
		return amntDamage;
	}
	public void setDamage(double amntDamage){
		this.amntDamage = amntDamage;
	}
	public void followHeroShip(){
		System.out.println(getName()+" is following the hero");
	}
	public void displayEnemyShip(){
		System.out.println(getName()+" is on the screen");
	}
	public void enemyShipShoots(){
		System.out.println(getName()+" attacks and does "+getDamage());
	}
}
