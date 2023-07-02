package behavioural.command;

public class TurnON implements ICommand {

    private final IElectrical electrical;

    public TurnON(IElectrical electrical) {
        this.electrical = electrical;
    }

    @Override
    public void execute() {
        this.electrical.on();
    }
}
