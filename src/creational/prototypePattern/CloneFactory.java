package creational.prototypePattern;

public class CloneFactory {
		public Animal getClone(Animal animalSample){
			return animalSample.makeCopy();
		}
}

