package behavioural.state;

public class Silent implements State {
    @Override
    public void alert() {
        System.out.println("Mobile is on Silent...");
    }
}
