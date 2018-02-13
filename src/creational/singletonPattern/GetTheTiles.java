package creational.singletonPattern;
import java.util.*;

public class GetTheTiles implements Runnable{

	public void run(){
		Singleton newInstance = Singleton.getInstance();
		System.out.println("instance id 1"+System.identityHashCode(newInstance)+" "+newInstance.hashCode());
		System.out.println(newInstance.getLetterList());
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Player 1: "+playerOneTiles);
		Singleton instanceTwo = Singleton.getInstance();
		System.out.println("instance id 2"+System.identityHashCode(instanceTwo)+" "+newInstance.hashCode());
		System.out.println(instanceTwo.getLetterList());
		LinkedList<String> playerTwoTiles = instanceTwo.getTiles(7);
		System.out.println("Player 2: "+playerTwoTiles);
		
	}
}
