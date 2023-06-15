package structural.decorator;

public class BasicSandwich implements ISandwich{
    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Bread";
    }
}
