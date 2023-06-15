package behavioural.command;

public class Remote {

    private final Command[] on_commands;
    private final Command[] off_commands;

    public Remote() {
        this.on_commands = new Command[3];
        this.off_commands = new Command[3];
    }

    public void addCommand(int slot, Command on, Command off) {
        this.on_commands[slot] = on;
        this.off_commands[slot] = off;
    }

    public void onBtnPress(int slot) {
        this.on_commands[slot].execute();
    }

    public void offBtnPress(int slot) {
        this.off_commands[slot].execute();
    }
}
