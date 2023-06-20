package creational.builder;

public class RobotEngineer {

    private final IRobotBuilder robotBuilder;

    public RobotEngineer(Robot robot) {
        this.robotBuilder = new RobotBuilder(robot);
    }

    public Robot getRobot() {
        return this.robotBuilder.getRobot();
    }

    public void makeRobot() {
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();
    }
}
