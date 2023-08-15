package structural.bridge;

public class AmericanRestaurant extends Restaurant{

    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected void addingSauce() {
        this.pizza.setSauce("Super secret recipe");
    }

    @Override
    protected void addingToppings() {
        this.pizza.setToppings("Everything");
    }

    @Override
    protected void makeCrust() {
        this.pizza.setCrust("thick");
    }
}
