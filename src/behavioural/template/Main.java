package behavioural.template;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.buildVehicle();
        System.out.println("-------------------");

        Truck truck = new Truck();
        truck.buildVehicle();
    }
}
