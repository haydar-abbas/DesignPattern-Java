package creational.abstractfactory;

import creational.abstractfactory.banks.IBank;
import creational.abstractfactory.payments.IPaymentCard;

public interface IBankFactory {
    IBank getBank(String bankCode);
    IPaymentCard getPaymentCard(String cardNumber);
}
