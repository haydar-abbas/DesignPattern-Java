package behavioural.strategy;

import behavioural.strategy.flybehavior.FlyNoWay;
import behavioural.strategy.flybehavior.FlyWithRocket;
import behavioural.strategy.flybehavior.FlyWithWings;
import behavioural.strategy.subducks.GreenHeadDuck;
import behavioural.strategy.subducks.RedHeadDuck;
import behavioural.strategy.subducks.RubberDuck;

public class Main {

    public static void main(String[] args) {
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
        greenHeadDuck.setFlyBehavior(new FlyWithWings());

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.setFlyBehavior(new FlyWithRocket());

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehavior(new FlyNoWay());

        System.out.println(greenHeadDuck.fly());
        System.out.println(redHeadDuck.fly());
        System.out.println(rubberDuck.fly());
    }
}
