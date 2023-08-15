package structural.bridge;

public class PepperoniPizza extends Pizza{
    @Override
    protected void assemble() {
        System.out.println("Pepperoni Pizza:");
        System.out.printf("Adding sauce: %s\n", this.sauce);
        System.out.printf("Adding Toppings: %s\n", this.toppings);
        System.out.println("Adding Pepperoni");
    }

    @Override
    protected void qualityCheck() {
        System.out.printf("Crust is: %s\n", this.crust);
    }
}
