package creational.abstractfactory;

public class OrderProcessor {

    private final TaxProcessor taxProcessor;
    private final ShipFeeProcessor shipFeeProcessor;

    public OrderProcessor(FinancialToolsFactory factory) {
        this.taxProcessor = factory.createTaxProcessor();
        this.shipFeeProcessor = factory.createShipFeeProcessor();
    }

    public void processOrder(Order order) {
        taxProcessor.calculateTaxes(order);
        shipFeeProcessor.calculateShipFee(order);
    }
}
