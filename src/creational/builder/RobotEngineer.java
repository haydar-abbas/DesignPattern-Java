package creational.builder;

public class RobotEngineer {

    private final RobotBuilder robotBuilder;

    public RobotEngineer() {
        this.robotBuilder = new RobotBuilder(new Robot());
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
