package creational.abstractfactory.banks;

public class BankB implements IBank {
    @Override
    public String createAccountBank() {
        return "Bank B!";
    }
}
