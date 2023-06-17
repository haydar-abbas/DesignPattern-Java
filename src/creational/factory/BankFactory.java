package creational.factory;

public class BankFactory implements IBankFactory {
    @Override
    public IBank getBank(String bankCode) {
        return switch (bankCode) {
            case "111111" -> new BankA();
            case "123456" -> new BankB();
            default -> null;
        };
    }
}
