package behavioural.command;

public class TurnOFF implements ICommand {

    private final IElectrical electrical;

    public TurnOFF(IElectrical electrical) {
        this.electrical = electrical;
    }

    @Override
    public void execute() {
        this.electrical.off();
    }
}
