package creational.abstractfactory;

public class EuropeTaxProcessor extends TaxProcessor{
    @Override
    void calculateTaxes(Order order) {
        order.setLocation("Europe");
        System.out.printf("%s specific tax calculation\n", order.getLocation());
        System.out.println("=================================\n");
    }
}
