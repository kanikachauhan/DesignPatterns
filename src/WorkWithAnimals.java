
public class WorkWithAnimals {
	

	public static void main(String[] args){
		Dog fido = new Dog();
		fido.setName("Fido");
		System.out.println(fido.getName());
		fido.getSound();
		fido.setWeight(-1);
		int randnum = 10;
		fido.changeVar(randnum);
		System.out.println(randnum);
		changeObjectName(fido);
		System.out.println(fido.getName());
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		System.out.println("sound one "+doggy.getSound());
		System.out.println("sound two "+kitty.getSound());
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		System.out.println("sound one "+animals[0].getSound());
		System.out.println("sound two "+animals[1].getSound());
		speakAnimal(animals[0]);
		speakAnimal(animals[1]);
		((Dog)doggy).digHole();
	}
	public static void speakAnimal(Animal getAnimal){
		System.out.println("Says "+getAnimal.getSound());
	}
	public static void changeObjectName(Dog fido){
		fido.setName("marcus");
	}
}
