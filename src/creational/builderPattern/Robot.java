package creational.builderPattern;

public class Robot implements RobotPlan{
	private String robotHead;
	private String robotTorso;
	private String robotArm;
	private String robotLeg;

	@Override
	public void setRobotHead(String head) {
		robotHead = head;
	}

	@Override
	public void setRobotTorso(String torso) {
		robotTorso = torso;
	}

	@Override
	public void setRobotArms(String arms) {
		robotArm = arms;
	}

	@Override
	public void setRobotLegs(String legs) {
		robotLeg = legs;
	}

	public String getHead(){
		return robotHead;
	}
	public String getTorso(){
		return robotTorso;
	}
	public String getArm(){
		return robotArm;
	}
	public String getLeg(){
		return robotLeg;
	}
}
