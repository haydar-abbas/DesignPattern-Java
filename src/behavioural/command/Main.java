package behavioural.command;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();
        Switch aSwitch = new Switch();

        aSwitch.addCommand(light.name, new OnCommand(light), new OffCommand(light));
        aSwitch.addCommand(fan.name, new OnCommand(fan), new OffCommand(fan));

        aSwitch.onBtnPress(light.name);
        aSwitch.offBtnPress(light.name);
        aSwitch.onBtnPress(fan.name);
        aSwitch.offBtnPress(fan.name);

    }
}
