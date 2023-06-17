package creational.abstractfactory;

import creational.abstractfactory.banks.*;
import creational.abstractfactory.payments.*;

public class BankFactory implements IBankFactory {
    @Override
    public IBank getBank(String bankCode) {
        return switch (bankCode) {
            case "111" -> new BankA();
            case "123" -> new BankB();
            default -> null;
        };
    }

    @Override
    public IPaymentCard getPaymentCard(String cardNumber) {
        return switch (cardNumber) {
            case "11" -> new VisaCard();
            case "12" -> new MasterCard();
            default -> null;
        };
    }
}
