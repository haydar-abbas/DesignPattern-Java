package creational.builder;

public interface IRobotBuilder {
    void buildRobotHead();
    void buildRobotTorso();
    void buildRobotArms();
    void buildRobotLegs();
    Robot getRobot();
}
