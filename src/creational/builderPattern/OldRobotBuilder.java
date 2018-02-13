package creational.builderPattern;

public class OldRobotBuilder implements RobotBuilder{

	private Robot robot;
	public OldRobotBuilder() {
		this.robot = new Robot();
	}
	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Tin Head");
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Tin Torso");
	}

	@Override
	public void buildRobotArm() {
		robot.setRobotArms("BlowTorch Arms");
	}

	@Override
	public void buildRobotLeg() {
		robot.setRobotLegs("Tin Legs");
	}
	@Override
	public Robot getRobot() {
		return this.robot;
	}

}
