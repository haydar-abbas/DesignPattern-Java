package creational.abstractfactory;

public abstract class FinancialToolsFactory {
    abstract TaxProcessor createTaxProcessor();
    abstract ShipFeeProcessor createShipFeeProcessor();
}
