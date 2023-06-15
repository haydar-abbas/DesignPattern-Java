package behavioural.state;

public class Main {

    public static void main(String[] args) {
        MobileContext phone = new MobileContext(new Ringing());
        phone.alert();

        phone.setState(new Silent());
        phone.alert();
    }
}
