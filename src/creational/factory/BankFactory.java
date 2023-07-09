package creational.factory;

import creational.factory.banks.*;

public class BankFactory {

    public IBank getBank(String bankCode) {
        return switch (bankCode) {
            case "111" -> new BankA();
            case "123" -> new BankB();
            default -> null;
        };
    }
}
