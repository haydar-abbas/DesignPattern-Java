package creational.builder;

public class Main {

    public static void main(String[] args) {
        RobotBuilder robotBuilder = new RobotBuilder(new Robot());
        Robot robot = robotBuilder.getRobot();

        System.out.println("Robot Built...");
        System.out.println("Robot Head type: " + robot.getRobotHead());
        System.out.println("Robot Torso type: " + robot.getRobotTorso());
        System.out.println("Robot Arms type: " + robot.getRobotArms());
        System.out.println("Robot Legs type: " + robot.getRobotLegs());
    }
}
