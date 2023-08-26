package behavioural.command;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();
        Switch sw = new Switch();

        sw.addCommand(light, new OnCommand(light), new OffCommand(light));
        sw.addCommand(fan, new OnCommand(fan), new OffCommand(fan));

        sw.onBtnPress(light);
        sw.offBtnPress(light);
        sw.onBtnPress(fan);
        sw.offBtnPress(fan);
    }
}
