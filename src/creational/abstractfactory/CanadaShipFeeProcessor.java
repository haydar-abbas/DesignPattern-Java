package creational.abstractfactory;

public class CanadaShipFeeProcessor extends ShipFeeProcessor{
    @Override
    void calculateShipFee(Order order) {
        order.setLocation("Canada");
        System.out.printf("%s specific ship fee calculation\n", order.getLocation());
        System.out.println("=================================\n");
    }
}
