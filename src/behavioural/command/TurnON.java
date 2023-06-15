package behavioural.command;

public class TurnON implements Command {

    private final Electrical electrical;

    public TurnON(Electrical electrical) {
        this.electrical = electrical;
    }

    @Override
    public void execute() {
        this.electrical.on();
    }
}
