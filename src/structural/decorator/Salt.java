package structural.decorator;

public class Salt extends SandwichDecorator {

    public Salt(ISandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Salt";
    }
}
