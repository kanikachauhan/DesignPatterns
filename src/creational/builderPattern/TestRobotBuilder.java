package creational.builderPattern;

public class TestRobotBuilder {
	public static void main(String[] args){
		RobotBuilder roboObjt = new OldRobotBuilder();
		RobotEngineer roboEng = new RobotEngineer(roboObjt);
		roboEng.makeRobot();
		System.out.println(roboEng.getRobot().getHead());
		System.out.println(roboEng.getRobot().getArm());
		System.out.println(roboEng.getRobot().getLeg());
		System.out.println(roboEng.getRobot().getTorso());
	}
}
