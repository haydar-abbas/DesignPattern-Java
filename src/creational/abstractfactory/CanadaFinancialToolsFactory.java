package creational.abstractfactory;

public class CanadaFinancialToolsFactory extends FinancialToolsFactory{
    @Override
    TaxProcessor createTaxProcessor() {
        return new CanadaTaxProcessor();
    }

    @Override
    ShipFeeProcessor createShipFeeProcessor() {
        return new CanadaShipFeeProcessor();
    }
}
