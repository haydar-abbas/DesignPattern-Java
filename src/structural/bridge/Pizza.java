package structural.bridge;

public abstract class Pizza {

    protected String sauce;
    protected String toppings;
    protected String crust;

    protected abstract void assemble();
    protected abstract void qualityCheck();

    protected void setSauce(String sauce) {
        this.sauce = sauce;
    }

    protected void setToppings(String toppings) {
        this.toppings = toppings;
    }

    protected void setCrust(String crust) {
        this.crust = crust;
    }
}
