package creational.factory;

public class BankFactory {

    public Bank getBank(String bankCode) {
        return switch (bankCode) {
            case "111" -> new BankA();
            case "123" -> new BankB();
            default -> null;
        };
    }
}
