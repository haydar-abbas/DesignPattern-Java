package behavioural.strategy;

import behavioural.strategy.flybehavior.FlyNoWay;
import behavioural.strategy.flybehavior.FlyWithRocket;

public class Main {

    public static void main(String[] args) {
        Duck duck = new NormalDuck("Duck");
        System.out.println(duck.fly());

        duck.setFlyBehavior(new FlyWithRocket());
        System.out.println(duck.fly());

        duck.setFlyBehavior(new FlyNoWay());
        System.out.println(duck.fly());
    }
}
