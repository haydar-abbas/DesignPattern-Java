package structural.bridge;

public abstract class Restaurant {

    protected Pizza pizza;

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addingSauce();
    abstract void addingToppings();
    abstract void makeCrust();

    public void deliver() {
        this.makeCrust();
        this.addingSauce();
        this.addingToppings();
        this.pizza.assemble();
        this.pizza.qualityCheck();
        System.out.println("Order in progress...!");
    }
}
