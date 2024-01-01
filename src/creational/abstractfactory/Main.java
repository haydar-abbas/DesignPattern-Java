package creational.abstractfactory;

public class Main {

    public static void main(String[] args) {

        Order newOrder = new Order();
        OrderProcessor orderProcessor;
        String countryCode = "CA";

        switch (countryCode) {
            case "EU":
                orderProcessor = new OrderProcessor(new EuropeFinancialToolsFactory());
                break;
            case "CA":
                orderProcessor = new OrderProcessor(new CanadaFinancialToolsFactory());
                break;
            default:
                System.out.println("The country is not define!");
                return;
        }
        orderProcessor.processOrder(newOrder);

    }
}
