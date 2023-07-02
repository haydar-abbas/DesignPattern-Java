package behavioural.command;

public class Remote {

    private final ICommand[] on_commands;
    private final ICommand[] off_commands;

    public Remote() {
        this.on_commands = new ICommand[3];
        this.off_commands = new ICommand[3];
    }

    public void addCommand(int slot, ICommand on, ICommand off) {
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
