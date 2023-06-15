package structural.decorator;

public class Cheese extends SandwichDecorator{

    public Cheese(ISandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }
}
