package creational.abstractfactory;

public class CanadaTaxProcessor extends TaxProcessor{
    @Override
    void calculateTaxes(Order order) {
        order.setLocation("Canada");
        System.out.printf("%s specific tax calculation\n", order.getLocation());
        System.out.println("=================================\n");
    }
}
