package structural.decorator;

public class Main {

    public static void main(String[] args) {

        ISandwich sandwich = new Cheese(new Beef(new BasicSandwich()));
        System.out.println("Description: " + sandwich.getDescription());
        System.out.println("Cost: " +sandwich.getCost());
    }
}
