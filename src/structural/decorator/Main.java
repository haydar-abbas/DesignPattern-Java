package structural.decorator;

public class Main {

    public static void main(String[] args) {

        ISandwich sandwich = new BasicSandwich();
        sandwich = new Beef(sandwich);
        sandwich = new Cheese(sandwich);
        sandwich = new Salt(sandwich);
        System.out.println("Description: " + sandwich.getDescription());
        System.out.println("Cost: " +sandwich.getCost());
    }
}
