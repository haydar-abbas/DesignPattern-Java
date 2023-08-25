package behavioural.command;

public class OnCommand implements Command {

    private final Devices devices;

    public OnCommand(Devices devices) {
        this.devices = devices;
    }

    public void execute() {
        devices.on();
    }

}
