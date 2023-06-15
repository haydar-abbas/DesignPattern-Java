package behavioural.strategy.flybehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public String fly() {
        return "no Fly!!";
    }
}
