package behavioural.command;

public class OffCommand implements Command {

    private final Device device;

    public OffCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.off();
    }

}
