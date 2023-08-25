package behavioural.command;

import java.util.HashMap;
import java.util.Map;

public class Switch {

    private final Map<String, Command> onCommands;
    private final Map<String, Command> offCommands;

    public Switch() {
        onCommands = new HashMap<>();
        offCommands = new HashMap<>();
    }

    public void addCommand(String name, Command on, Command off) {
        onCommands.put(name, on);
        offCommands.put(name, off);
    }

    public void onBtnPress(String name) {
        onCommands.get(name).execute();
    }

    public void offBtnPress(String name) {
        offCommands.get(name).execute();
    }

}
