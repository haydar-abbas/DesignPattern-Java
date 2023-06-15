package behavioural.strategy;

import behavioural.strategy.flybehavior.FlyWithWings;

public class NormalDuck extends Duck {

    public NormalDuck(String name) {
        setName(name);
        setFlyBehavior(new FlyWithWings());
    }
}
