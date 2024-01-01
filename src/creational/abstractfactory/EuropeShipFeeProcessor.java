package creational.abstractfactory;

public class EuropeShipFeeProcessor extends ShipFeeProcessor{
    @Override
    void calculateShipFee(Order order) {
        order.setLocation("Europe");
        System.out.printf("%s specific ship fee calculation\n", order.getLocation());
        System.out.println("=================================\n");
    }
}
