package behavioural.state;

public class Ringing implements State {
    @Override
    public void alert() {
        System.out.println("Mobile is Ringing...");
    }
}
