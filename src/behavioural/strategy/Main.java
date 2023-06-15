package behavioural.strategy;

import behavioural.strategy.flybehavior.FlyNoWay;
import behavioural.strategy.flybehavior.FlyWithRocket;

public class Main {

    public static void main(String[] args) {
        Duck duck1 = new NormalDuck("Duck1");
        System.out.println(duck1.fly());
        duck1.setFlyBehavior(new FlyWithRocket());
        System.out.println(duck1.fly());

        Duck duck2 = new NormalDuck("duck2");
        System.out.println(duck2.fly());
        duck2.setFlyBehavior(new FlyNoWay());
        System.out.println(duck2.fly());

    }
}
