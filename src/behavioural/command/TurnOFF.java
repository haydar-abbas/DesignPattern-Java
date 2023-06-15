package behavioural.command;

public class TurnOFF implements Command {

    private final Electrical electrical;

    public TurnOFF(Electrical electrical) {
        this.electrical = electrical;
    }

    @Override
    public void execute() {
        this.electrical.off();
    }
}
