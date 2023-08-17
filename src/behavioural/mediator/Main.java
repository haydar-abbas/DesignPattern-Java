package behavioural.mediator;

public class Main {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User haydar = new UserImp(mediator, "Haydar");
        User abbas = new UserImp(mediator, "Abbas");
        User ali = new UserImp(mediator, "Ali");
        User lisa = new UserImp(mediator, "Lisa");
        mediator.addUser(haydar);
        mediator.addUser(abbas);
        mediator.addUser(ali);
        mediator.addUser(lisa);

        haydar.send("Hi All");
        lisa.send("Hi");
    }
}
