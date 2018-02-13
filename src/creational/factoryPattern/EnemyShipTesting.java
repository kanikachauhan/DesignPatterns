package creational.factoryPattern;
import java.util.Scanner;
public class EnemyShipTesting {

	public static void main(String[] srga){
		EnemyShipFactory fact = new EnemyShipFactory();
		EnemyShip theEnemy = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("U/R/B");
		if(sc.hasNextLine()){
			theEnemy = fact.makeEnemyShip(sc.nextLine());
		}
		if(theEnemy!=null){
			doStuffEnemy(theEnemy);
		}else{
			System.out.println("Enter valid option");
		}
	}
	public static void doStuffEnemy(EnemyShip enemyShip){
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}
}
