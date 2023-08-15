package structural.bridge;

public class ItalianRestaurant extends Restaurant{

    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected void addingSauce() {
        this.pizza.setSauce("Oil");
    }

    @Override
    protected void addingToppings() {
        this.pizza.setToppings("null");
    }

    @Override
    protected void makeCrust() {
        this.pizza.setCrust("thin");
    }
}
