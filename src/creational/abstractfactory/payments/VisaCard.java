package creational.abstractfactory.payments;

public class VisaCard implements IPaymentCard{
    @Override
    public String getPaymentCard() {
        return "Visa Card";
    }
}
