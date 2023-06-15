package structural.decorator;

public abstract class SandwichDecorator implements ISandwich {

    private final ISandwich sandwich;

    public SandwichDecorator(ISandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public double getCost() {
        return this.sandwich.getCost();
    }

    @Override
    public String getDescription() {
        return this.sandwich.getDescription();
    }
}
