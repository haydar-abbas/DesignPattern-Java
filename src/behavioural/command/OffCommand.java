package behavioural.command;

public class OffCommand implements Command {

    private final Devices devices;

    public OffCommand(Devices devices) {
        this.devices = devices;
    }

    public void execute() {
        devices.off();
    }

}
