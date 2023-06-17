package creational.abstractfactory.payments;

public class MasterCard implements IPaymentCard{
    @Override
    public String getPaymentCard() {
        return "Master Card";
    }
}
