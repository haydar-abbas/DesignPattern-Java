package behavioural.command;

import java.util.HashMap;
import java.util.Map;

public class Switch {

    private final Map<Device, Command> onCommands;
    private final Map<Device, Command> offCommands;

    public Switch() {
        onCommands = new HashMap<>();
        offCommands = new HashMap<>();
    }

    public void addCommand(Device device, Command on, Command off) {
        onCommands.put(device, on);
        offCommands.put(device, off);
    }

    public void onBtnPress(Device device) {
        onCommands.get(device).execute();
    }

    public void offBtnPress(Device device) {
        offCommands.get(device).execute();
    }

}
