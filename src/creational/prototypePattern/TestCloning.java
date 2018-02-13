package creational.prototypePattern;

public class TestCloning {

	public static void main(String[] args){
		CloneFactory animalMaker = new CloneFactory();
		Sheep sally = new Sheep();
		Sheep clonedSheep = (Sheep)animalMaker.getClone(sally);
		System.out.println(sally.toString());
		System.out.println(clonedSheep.toString());
		System.out.println("Sally hash code "+sally.hashCode());
		System.out.println("Cloned hash code "+clonedSheep.hashCode());
	}
}
