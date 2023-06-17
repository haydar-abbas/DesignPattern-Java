package structural.decorator;

public class Main {

    public static void main(String[] args) {

        ISandwich sandwich = new BasicSandwich();
        System.out.println("Description: " + sandwich.getDescription());
        System.out.println("Cost: " +sandwich.getCost());

        sandwich = new Beef(sandwich);
        System.out.println("Description: " + sandwich.getDescription());
        System.out.println("Cost: " +sandwich.getCost());

        sandwich = new Cheese(sandwich);
        System.out.println("Description: " + sandwich.getDescription());
        System.out.println("Cost: " +sandwich.getCost());

        sandwich = new Salt(sandwich);
        System.out.println("Description: " + sandwich.getDescription());
        System.out.println("Cost: " +sandwich.getCost());
    }
}
