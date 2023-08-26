package behavioural.command;

public class OnCommand implements Command {

    private final Device device;

    public OnCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.on();
    }

}
