
public class Dog extends Animal{

	public Dog(){
		super();
		setSound("bark");
	}
	public void digHole(){
		System.out.println("Dig a hole");
	}
	public void changeVar(int randnum){
		randnum = 12;
		System.out.println("Inside dog class "+randnum);
	}
}
