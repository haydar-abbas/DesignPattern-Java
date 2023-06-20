package creational.builder;

public class RobotBuilder implements IRobotBuilder {

    private final Robot robot;

    public RobotBuilder(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void buildRobotHead() {
        this.robot.setRobotHead("Tin Head!");
    }

    @Override
    public void buildRobotTorso() {
        this.robot.setRobotTorso("Tin Torso!");
    }

    @Override
    public void buildRobotArms() {
        this.robot.setRobotArms("Blowtorch Arms!");
    }

    @Override
    public void buildRobotLegs() {
        this.robot.setRobotLegs("Roller Skates!");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
