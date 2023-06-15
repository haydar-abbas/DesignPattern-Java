package behavioural.strategy;

import behavioural.strategy.flybehavior.FlyBehavior;

public abstract class Duck {

    private String name;
    private FlyBehavior flyBehavior;

    public String fly() {
        return String.format("%s can %s", this.name, this.flyBehavior.fly());
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    protected void setName(String name) {
        this.name = name;
    }

}
