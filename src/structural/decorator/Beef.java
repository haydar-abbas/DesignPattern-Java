package structural.decorator;

public class Beef extends SandwichDecorator{

    public Beef(ISandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {
        return super.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Beef";
    }
}
