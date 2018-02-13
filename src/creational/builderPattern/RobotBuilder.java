package creational.builderPattern;

public interface RobotBuilder {

	public void buildRobotHead();
	public void buildRobotTorso();
	public void buildRobotArm();
	public void buildRobotLeg();
	public Robot getRobot();
}
