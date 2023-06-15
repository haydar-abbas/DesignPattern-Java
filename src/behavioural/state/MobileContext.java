package behavioural.state;

public class MobileContext {

    private State state;

    public MobileContext(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void alert() {
        this.state.alert();
    }
}
