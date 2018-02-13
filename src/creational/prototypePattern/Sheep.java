package creational.prototypePattern;

public class Sheep implements Animal{

	Sheep(){
		System.out.println("Sheep is Made");
	}
	@Override
	public Animal makeCopy() {
		System.out.println("Sheep is being Made");
		Sheep sheepObj = null;
		try{
			sheepObj = (Sheep)super.clone();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return sheepObj ;
	}
	
	public String toString(){
		return "Dolly is My hero";
	}
	
}
