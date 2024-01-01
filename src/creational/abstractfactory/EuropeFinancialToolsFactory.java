package creational.abstractfactory;

public class EuropeFinancialToolsFactory extends FinancialToolsFactory{
    @Override
    TaxProcessor createTaxProcessor() {
        return new EuropeTaxProcessor();
    }

    @Override
    ShipFeeProcessor createShipFeeProcessor() {
        return new EuropeShipFeeProcessor();
    }
}
