package creational.builder;

public class RobotBuilder {

    private final Robot robot;

    public RobotBuilder(Robot robot) {
        this.robot = robot;
    }

    public void buildRobotHead() {
        this.robot.setRobotHead("Tin Head!");
    }

    public void buildRobotTorso() {
        this.robot.setRobotTorso("Tin Torso!");
    }

    public void buildRobotArms() {
        this.robot.setRobotArms("Blowtorch Arms!");
    }

    public void buildRobotLegs() {
        this.robot.setRobotLegs("Roller Skates!");
    }

    public Robot getRobot() {
        return this.robot;
    }
}
